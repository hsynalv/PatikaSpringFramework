package com.beyazskorsky.ioc_di;

public class Boss implements IBoss{
    @Override
    public String version(String data){
        return "verison is  " + data;
    }
}
