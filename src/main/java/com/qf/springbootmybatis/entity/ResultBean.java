package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultBean<T> {
    /**
     * 状态码
     */
    private String respCode;
    /**
     * 提示信息
     */
    private T data;
}
