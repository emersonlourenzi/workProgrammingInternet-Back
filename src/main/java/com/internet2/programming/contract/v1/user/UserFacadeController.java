package com.internet2.programming.contract.v1.user;

import com.internet2.programming.contract.v1.user.mapper.UserMapper;
import com.internet2.programming.contract.v1.user.model.UserRequest;
import com.internet2.programming.contract.v1.user.model.UserResponse;
import com.internet2.programming.implementation.user.UserFacadeImp;
import com.internet2.programming.implementation.user.mapper.UserMapperImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class UserFacadeController {
    private UserFacadeImp userFacadeImp;

    public List<UserResponse> findAll() {
        return userFacadeImp.findAll().stream().map(UserMapper::mapToContract).collect(Collectors.toList());
    }

    public UserResponse findById(String id) throws Exception {
        return UserMapper.mapToContract(userFacadeImp.findById(id));
    }

    public UserResponse create(UserRequest user) {
        return UserMapper.mapToContract(userFacadeImp.create(UserMapper.mapToImp(user)));
    }

    public void deleteById(String id) throws Exception {
        userFacadeImp.deleteById(id);
    }

    public UserResponse update(String id, UserRequest user) throws Exception {
        return UserMapper.mapToContract(userFacadeImp.update(id, UserMapper.mapToImp(user)));
    }
}
