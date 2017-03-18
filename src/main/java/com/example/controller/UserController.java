package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiachao on 2017/3/18.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users/save")
    public ResponseEntity save(){
        User user1 = new User();
        user1.setPwd("123456");
        user1.setUserName("夏超");
        userRepository.save(user1);
        return ResponseEntity.ok("save success");
    }

    @RequestMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> userList = new ArrayList<User>();
        userList = userRepository.findAll();
        return ResponseEntity.ok(userList);
    }
}
