package com.sd.lompractice.controller;

import com.sd.lompractice.model.User;
import com.sd.lompractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService userservice;
    @Autowired
    User user;

    @PostMapping("/save")
    private User save(@RequestBody User user){
       return userservice.save(user);
    }
}
