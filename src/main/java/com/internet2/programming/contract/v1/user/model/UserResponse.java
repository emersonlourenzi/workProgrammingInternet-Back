package com.internet2.programming.contract.v1.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Builder
@Document(value = "users")
public class UserResponse {
    private String id;
    private String nameUser;
    private String emailUser;
}
