package com.beyazskorsky.iocsiz_disiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizEmployee")
@ApplicationScoped
public class Employee {

    private Boss boss;

    public Employee() {
        this.boss = new Boss();
    }

    public String getData(String data){
        return boss.version(data);
    }
}
