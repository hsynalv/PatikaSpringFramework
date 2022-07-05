package com.beyazskorsky.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss_1 implements IBoss {
    @Override
    public String version(String data){
        return "Boss_1: verison is  " + data;
    }
}
