package com.beyazskorsky.qualifier4;

@QualifierMultiple4(E_Options.SECOND)
public class Boss_3 implements IBoss {
    @Override
    public String version(String data){
        return "QualifierMultiple Second  " + data;
    }
}
