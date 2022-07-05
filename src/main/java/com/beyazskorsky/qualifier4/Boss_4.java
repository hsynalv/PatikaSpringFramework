package com.beyazskorsky.qualifier4;

@QualifierMultiple4(E_Options.THIRD)
public class Boss_4 implements IBoss {
    @Override
    public String version(String data){
        return "QualifierMultiple Third  " + data;
    }
}
