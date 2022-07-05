package com.beyazskorsky.aop.decorator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    IHome home;

    public String beanMethod(String data){
        return home.painting(data);
    }

}
