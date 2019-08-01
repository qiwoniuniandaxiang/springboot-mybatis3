package com.qf.springbootmybatis.test;

public class Ttest {
    public static void main(String[] args) {
        String reg="[1-9]\\d{3}-([1-9]|[0][1-9]|[1][0-2])-([1-9]|[0][1-9]|[1-2]\\d|[3][0-1])";
       String data="2019-7-09";
        if(data.matches(reg)){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
    }
}
