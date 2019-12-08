package com.internet2.programming.implementation.user.service;

import com.internet2.programming.implementation.user.mapper.UserMapperImp;
import com.internet2.programming.implementation.user.model.UserModelImp;
import com.internet2.programming.implementation.user.repository.UserEntity;
import com.internet2.programming.implementation.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<UserModelImp> findAll() {
        return userRepository.findAll().stream()
                .map(UserMapperImp::mapToModel)
                .collect(Collectors.toList());
    }

    public UserModelImp findById(String id) throws Exception {
        Optional<UserEntity> user = userRepository.findById(id);
        if (!user.isEmpty()) {
            return UserMapperImp.mapToModel(userRepository.findById(id).orElseThrow(InputMismatchException::new));
        } else {
            throw new Exception("User not found. ");
        }
    }

    public UserModelImp create(UserModelImp user) {
        return UserMapperImp.mapToModel(userRepository.save(UserMapperImp.mapToEntity(user)));
    }

    public void deleteById(String id) throws Exception {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new Exception("nonexistent user");
        }
    }

    public UserModelImp update(String id, UserModelImp user) throws Exception {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            user.setId(id);
            return UserMapperImp.mapToModel(userRepository.save(UserMapperImp.mapToEntity(user)));
        } else {
            throw new Exception("nonexistent user");
        }
    }
}
