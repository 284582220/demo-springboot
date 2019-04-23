package com.yangguojun.web.controller;


import com.yangguojun.web.po.User;
import com.yangguojun.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteUser(id);
    }

}
