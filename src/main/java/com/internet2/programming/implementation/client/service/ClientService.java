package com.internet2.programming.implementation.client.service;

import com.internet2.programming.implementation.client.mapper.ClientMapperImp;
import com.internet2.programming.implementation.client.model.ClientModelImp;
import com.internet2.programming.implementation.client.repository.ClientEntity;
import com.internet2.programming.implementation.client.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientService {
    private ClientRepository repository;

    public List<ClientModelImp> findAll() {
        return repository.findAll().stream()
                .map(ClientMapperImp::mapToModel)
                .collect(Collectors.toList());
    }

    public ClientModelImp findById(String id) throws Exception {
        Optional<ClientEntity> cli = repository.findById(id);
        if (!cli.isEmpty()) {
            return ClientMapperImp.mapToModel(repository.findById(id)
                    .orElseThrow(InputMismatchException::new));
        }
        else {
            throw new Exception("Client not found. ");
        }
    }

    public ClientModelImp create(ClientModelImp client) {
        return ClientMapperImp.mapToModel(repository.save(ClientMapperImp.mapToEntity(client)));
    }
}
