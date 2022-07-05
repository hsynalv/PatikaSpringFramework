package com.beyazskorsky.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternative")
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
