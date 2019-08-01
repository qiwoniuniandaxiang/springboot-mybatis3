package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.User;
import com.qf.springbootmybatis.entity.UserTest;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("getUserById/{id}")
    public String getUserById(@PathVariable("id") Integer userId, ModelMap map){
        User user = userService.getUserById(userId);
        map.put("name","李四");
        map.put("sex",18);
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        map.put("list",list);
        return "user";
    }
    @RequestMapping("usertest")
    public String usertest(@Valid UserTest user){
        return "usertest";
    }
    @RequestMapping("tousertest")
    public String getusertestpage(){
        return "usertest";
    }
}
