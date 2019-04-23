package com.yangguojun.web.service;

import com.yangguojun.web.po.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void deleteUser(Integer id);
}
