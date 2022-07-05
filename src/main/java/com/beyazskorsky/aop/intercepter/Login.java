package com.beyazskorsky.aop.intercepter;

@Interceptor
public class Login {

    public String isLoginMethod(String data){
        return "isLogin " + data;
    }

}
