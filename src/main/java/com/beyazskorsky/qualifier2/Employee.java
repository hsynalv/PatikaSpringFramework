package com.beyazskorsky.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier2")
@ApplicationScoped
public class Employee {

    // default halinde çalışacak olan kod
   /* @Inject
    private IBoss boss;*/

     @Inject
     @QualifierMultiple
     private IBoss boss;

    public Employee()
    {
        //this.boss = new Boss();
    }

    public String getData(String data){
        return boss.version(data);
    }
}
