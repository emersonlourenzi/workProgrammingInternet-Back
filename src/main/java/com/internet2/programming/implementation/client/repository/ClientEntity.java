package com.internet2.programming.implementation.client.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Builder
@Document(value = "clients")
public class ClientEntity {
    private String id;
    private String nameClient;
    private String foneClient;
    private String addressClient;
}
