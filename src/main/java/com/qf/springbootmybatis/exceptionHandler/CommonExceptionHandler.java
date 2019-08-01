package com.qf.springbootmybatis.exceptionHandler;

import com.qf.springbootmybatis.entity.ResultBean;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handleException(Exception e){
        return new ResultBean("404","您的操作有误导致找不到页面,自己反省一下在来吧");
    }
}
