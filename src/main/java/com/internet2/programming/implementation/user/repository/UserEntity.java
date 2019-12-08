package com.internet2.programming.implementation.user.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Builder
@Document(value = "users")
public class UserEntity {
    private String id;
    private String nameUser;
    private String emailUser;
    private String passUser;
}
