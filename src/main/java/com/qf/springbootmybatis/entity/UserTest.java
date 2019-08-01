package com.qf.springbootmybatis.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class UserTest {
    /**
     * 给日期进行校验
     */
    @Pattern(regexp = "^[1-9]\\d{3}-([1-9]|[0][1-9]|[1][0-2])-([1-9]|[0][1-9]|[1-2]\\d|[3][0-1])$",message = "日期格式错误")
    private String birthday;
    @Email(message = "邮箱格式不正确")
    private String email;
    @Pattern(regexp = "^1[34578]\\d{9}$",message = "手机号码格式错误")
    private String phone;
    @NotNull(message = "不能为空")
    private String name;
}
