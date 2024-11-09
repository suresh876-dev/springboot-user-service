package com.codedecode.userinfo.controller;

import com.codedecode.userinfo.dto.UserDTO;
import com.codedecode.userinfo.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO)
    {
       UserDTO userDto = userService.addUser(userDTO);

       return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    @GetMapping("fetchUserById/{userId}")
    public ResponseEntity<UserDTO> fetchUserDetailsById(@PathVariable Integer userId)
    {
        return userService.fetchUserDetailsBuyId(userId);

    }


}
