package com.beyazskorsky.qualifier2;

@QualifierMultiple
public class Boss_2 implements IBoss {
    @Override
    public String version(String data){
        return "QualifierMultiple 1  " + data;
    }
}
