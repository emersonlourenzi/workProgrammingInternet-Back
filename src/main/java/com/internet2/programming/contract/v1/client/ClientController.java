package com.internet2.programming.contract.v1.client;

import com.internet2.programming.contract.v1.client.model.ClientResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("v1/clients")
@RestController
@AllArgsConstructor
public class ClientController {
    private ClientFacadeController facade;

    @GetMapping()
    public List<ClientResponse> findAll() {
        return facade.findAll();
    }

    @GetMapping("{id}")
    public ClientResponse findById(@PathVariable String id) throws Exception {
        return facade.findById(id);
    }

    @PostMapping()
    public ClientResponse create(@RequestBody ClientResponse client) {
        return facade.create(client);
    }
}
