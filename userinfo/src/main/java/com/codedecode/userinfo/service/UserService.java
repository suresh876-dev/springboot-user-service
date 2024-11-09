package com.codedecode.userinfo.service;

import com.codedecode.userinfo.dto.UserDTO;
import com.codedecode.userinfo.entity.User;
import com.codedecode.userinfo.mapper.UserMapper;
import com.codedecode.userinfo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public UserDTO addUser(UserDTO userDTO) {
        User savedUser = userRepo.save(UserMapper.INSTANCE.mapUserDTOtoUser(userDTO));

        return UserMapper.INSTANCE.mapUsertoUserDTO(savedUser);
    }

    public ResponseEntity<UserDTO> fetchUserDetailsBuyId(Integer userId) {
        Optional<User> savedUser = userRepo.findById(userId);
        if(savedUser.isPresent())
        {
            return new ResponseEntity<>(UserMapper.INSTANCE.mapUsertoUserDTO(savedUser.get()), HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
