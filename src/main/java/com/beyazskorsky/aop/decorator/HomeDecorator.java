package com.beyazskorsky.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract public class HomeDecorator implements IHome{


    private @Inject @Delegate
    IHome home;

    @Override
    public String painting(String data) {
        System.out.println("Decorator was here");
        String dataInformation = home.painting(data);
        if(dataInformation.equals("codding")){
            dataInformation = dataInformation.toUpperCase();
        }

        return dataInformation;
    }
}
