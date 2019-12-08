package com.internet2.programming.contract.v1.client.mapper;

import com.internet2.programming.contract.v1.client.model.ClientRequest;
import com.internet2.programming.contract.v1.client.model.ClientResponse;
import com.internet2.programming.implementation.client.model.ClientModelImp;

public class ClientMapper {
    public static ClientResponse mapToContract(ClientModelImp clientModelImp) {
        return ClientResponse.builder()
                .id(clientModelImp.getId())
                .nameClient(clientModelImp.getNameClient())
                .foneClient(clientModelImp.getFoneClient())
                .addressClient(clientModelImp.getAddressClient())
                .build();
    }

    public static ClientModelImp mapToImp(ClientRequest clientRequest) {
        return ClientModelImp.builder()
                .nameClient(clientRequest.getNameClient())
                .foneClient(clientRequest.getFoneClient())
                .addressClient(clientRequest.getAddressClient())
                .build();
    }
}
