package com.internet2.programming.contract.v1.user;

import com.internet2.programming.contract.v1.user.model.UserRequest;
import com.internet2.programming.contract.v1.user.model.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/v1/users")
@RestController
@AllArgsConstructor
public class UserController {
    private UserFacadeController userFacadeController;

    @GetMapping
    public List<UserResponse> findAll() {
        return userFacadeController.findAll();
    }

    @GetMapping("/{id}")
    public UserResponse findById(@PathVariable String id) throws Exception {
        return userFacadeController.findById(id);
    }

    @PostMapping
    public UserResponse create(@RequestBody UserRequest user) {
        return userFacadeController.create(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String id) throws Exception {
        userFacadeController.deleteById(id);
    }

    @PutMapping("/{id}")
    public UserResponse update(@PathVariable String id, @RequestBody @Valid UserRequest user) throws Exception {
        return userFacadeController.update(id, user);
    }

}
