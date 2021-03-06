package com.internet2.programming.contract.v1.client;

import com.internet2.programming.contract.v1.client.model.ClientRequest;
import com.internet2.programming.contract.v1.client.model.ClientResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ClientResponse create(@RequestBody ClientRequest client) {
        return facade.create(client);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String id) throws Exception {
        facade.deleteById(id);
    }

    @PutMapping("{id}")
    public ClientResponse update(@PathVariable String id, @RequestBody @Valid ClientRequest client) throws Exception {
        return facade.update(id, client);
    }
}
