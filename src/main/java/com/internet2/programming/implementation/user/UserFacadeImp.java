package com.internet2.programming.implementation.user;

import com.internet2.programming.contract.v1.user.model.UserRequest;
import com.internet2.programming.implementation.user.model.UserModelImp;
import com.internet2.programming.implementation.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UserFacadeImp {
    private UserService userService;

    public List<UserModelImp> findAll() {
        return userService.findAll();
    }

    public UserModelImp findById(String id) throws Exception {
        return userService.findById(id);
    }

    public UserModelImp create(UserModelImp user) {
        return userService.create(user);
    }

    public void deleteById(String id) throws Exception {
        userService.deleteById(id);
    }

    public UserModelImp update(String id, UserModelImp user) throws Exception {
        return userService.update(id, user);
    }
}
