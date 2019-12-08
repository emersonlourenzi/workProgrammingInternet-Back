package com.internet2.programming.implementation.client.mapper;

import com.internet2.programming.implementation.client.model.ClientModelImp;
import com.internet2.programming.implementation.client.repository.ClientEntity;

public class ClientMapperImp {
    public static ClientModelImp mapToModel(ClientEntity clientEntity) {
        return ClientModelImp.builder()
                .id(clientEntity.getId())
                .nameClient(clientEntity.getNameClient())
                .foneClient(clientEntity.getFoneClient())
                .addressClient(clientEntity.getAddressClient())
                .build();
    }

    public static ClientEntity mapToEntity(ClientModelImp clientModelImp) {
        return ClientEntity.builder()
                .id(clientModelImp.getId())
                .nameClient(clientModelImp.getNameClient())
                .foneClient(clientModelImp.getFoneClient())
                .addressClient(clientModelImp.getAddressClient())
                .build();
    }
}
