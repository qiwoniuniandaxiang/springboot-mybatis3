package com.qf.springbootmybatis.service;

import com.qf.springbootmybatis.entity.User;

public interface IUserService {
    User getUserById(Integer userId);
}
