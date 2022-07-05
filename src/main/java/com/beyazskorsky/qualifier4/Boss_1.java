package com.beyazskorsky.qualifier4;

import javax.enterprise.inject.Default;

@Default
public class Boss_1 implements IBoss {
    @Override
    public String version(String data){
        return "Default data: " + data;
    }
}
