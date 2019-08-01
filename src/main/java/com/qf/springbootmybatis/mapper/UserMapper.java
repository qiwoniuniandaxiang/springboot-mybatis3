package com.qf.springbootmybatis.mapper;

import com.qf.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author xiebin
 * @Date ${Date}
 */
public interface UserMapper{
    User getUserById(Integer userId);
}
