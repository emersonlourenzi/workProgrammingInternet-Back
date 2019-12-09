package com.internet2.programming.implementation.client;

import com.internet2.programming.implementation.client.model.ClientModelImp;
import com.internet2.programming.implementation.client.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ClientFacadeImp {
    private ClientService service;

    public List<ClientModelImp> findAll() {
        return service.findAll();
    }

    public ClientModelImp findById(String id) throws Exception {
        return service.findById(id);
    }

    public ClientModelImp create(ClientModelImp client) {
        return service.create(client);
    }

    public void deleteById(String id) throws Exception {
        service.deleteById(id);
    }

    public ClientModelImp update(String id, ClientModelImp client) throws Exception {
        return service.update(id, client);
    }
}
