package com.beyazskorsky.ioc_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "iocli_diliEmployee")
@ApplicationScoped
public class Employee {

    @Inject
    private IBoss boss;

    public Employee()
    {
        //this.boss = new Boss();
    }

    public String getData(String data){
        return boss.version(data);
    }
}
