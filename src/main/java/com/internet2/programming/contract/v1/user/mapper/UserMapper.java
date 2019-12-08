package com.internet2.programming.contract.v1.user.mapper;

import com.internet2.programming.contract.v1.user.model.UserRequest;
import com.internet2.programming.contract.v1.user.model.UserResponse;
import com.internet2.programming.implementation.user.model.UserModelImp;

public class UserMapper {

    public static UserResponse mapToContract(UserModelImp userModelImp) {
        return UserResponse.builder()
                .id(userModelImp.getId())
                .nameUser(userModelImp.getNameUser())
                .emailUser(userModelImp.getEmailUser())
                .build();
    }

    public static UserModelImp mapToImp(UserRequest userRequest) {
        return UserModelImp.builder()
                .nameUser(userRequest.getNameUser())
                .emailUser(userRequest.getEmailUser())
                .passUser(userRequest.getPassUser())
                .build();
    }
}
