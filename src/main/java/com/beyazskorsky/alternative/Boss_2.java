package com.beyazskorsky.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss_2 implements IBoss {
    @Override
    public String version(String data){
        return "Boss_2: verison is  " + data;
    }
}
