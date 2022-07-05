package com.beyazskorsky.aop.intercepter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "aopInterceptor")
@ApplicationScoped
public class AopBean implements Serializable {

    private static final long serialVersionUID=1L;

    @Inject
    private Login login;

    public String getAopBean(){
        return login.isLoginMethod("evet");
    }
}
