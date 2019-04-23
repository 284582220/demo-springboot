package com.yangguojun.web.service.impl;

import com.yangguojun.web.mapper.UserMapper;
import com.yangguojun.web.po.User;
import com.yangguojun.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return this.userMapper.getAllUsers();
    }

    @Override
    public void deleteUser(Integer id) {
        this.userMapper.delete(id);
    }
}
