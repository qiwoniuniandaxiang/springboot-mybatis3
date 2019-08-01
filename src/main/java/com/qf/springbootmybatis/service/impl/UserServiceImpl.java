package com.qf.springbootmybatis.service.impl;

import com.qf.springbootmybatis.entity.User;
import com.qf.springbootmybatis.mapper.UserMapper;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) {

        return userMapper.getUserById(userId);
    }
}
