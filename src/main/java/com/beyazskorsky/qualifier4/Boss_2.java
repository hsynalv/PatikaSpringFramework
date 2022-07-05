package com.beyazskorsky.qualifier4;

@QualifierMultiple4(E_Options.FIRST)
public class Boss_2 implements IBoss {
    @Override
    public String version(String data){
        return "QualifierMultiple First  " + data;
    }
}
