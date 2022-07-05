package com.beyazskorsky.qualifier4;

import com.beyazskorsky.qualifier2.QualifierMultiple;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier4")
@ApplicationScoped
public class Employee {

    // default halinde çalışacak olan kod
   /* @Inject
    private IBoss boss;*/

     @Inject
     @QualifierMultiple4(E_Options.SECOND) // istenilen yapı çalışır burda da
     private IBoss boss;

    public Employee()
    {
        //this.boss = new Boss();
    }

    public String getData(String data){
        return boss.version(data);
    }
}
