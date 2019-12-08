package com.internet2.programming.contract.v1.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(value = "clients")
public class ClientRequest {
    @Id
    private String id;
    @NotNull
    @NotEmpty(message = "Required Name field.")
    private String nameClient;
    @NotNull
    @NotEmpty(message = "Required number fone field.")
    private String foneClient;
    @NotNull
    @NotEmpty(message = "Required address field.")
    private String addressClient;
}
