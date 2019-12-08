package com.internet2.programming.contract.v1.client;

import com.internet2.programming.contract.v1.client.mapper.ClientMapper;
import com.internet2.programming.contract.v1.client.model.ClientRequest;
import com.internet2.programming.contract.v1.client.model.ClientResponse;
import com.internet2.programming.implementation.client.ClientFacadeImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class ClientFacadeController {
    private ClientFacadeImp facadeImp;

    public List<ClientResponse> findAll() {
        return facadeImp.findAll().stream().map(ClientMapper::mapToContract).collect(Collectors.toList());
    }

    public ClientResponse findById(String id) throws Exception {
        return ClientMapper.mapToContract(facadeImp.findById(id));
    }

    public ClientResponse create(ClientRequest client) {
        return ClientMapper.mapToContract(facadeImp.create(ClientMapper.mapToImp(client)));
    }
}
