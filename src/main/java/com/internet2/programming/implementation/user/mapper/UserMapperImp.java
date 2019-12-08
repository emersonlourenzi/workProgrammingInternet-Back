package com.internet2.programming.implementation.user.mapper;

import com.internet2.programming.implementation.user.model.UserModelImp;
import com.internet2.programming.implementation.user.repository.UserEntity;

public class UserMapperImp {

    public static UserModelImp mapToModel(UserEntity userEntity) {
        return UserModelImp.builder()
                .id(userEntity.getId())
                .nameUser(userEntity.getNameUser())
                .emailUser(userEntity.getEmailUser())
                .passUser(userEntity.getPassUser())
                .build();
    }

    public static UserEntity mapToEntity(UserModelImp userModelImp) {
        return UserEntity.builder()
                .id(userModelImp.getId())
                .nameUser(userModelImp.getNameUser())
                .emailUser(userModelImp.getEmailUser())
                .passUser(userModelImp.getPassUser())
                .build();
    }
}
