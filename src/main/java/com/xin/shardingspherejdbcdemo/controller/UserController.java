package com.xin.shardingspherejdbcdemo.controller;

import com.xin.shardingspherejdbcdemo.entity.User;
import com.xin.shardingspherejdbcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/saveUser")
    public Object saveUser(String name,int age) {
        return userService.save(new User(name,  age));
    }

    @GetMapping("/listUser")
    public Object listUser() {
        return userService.list();
    }

}

