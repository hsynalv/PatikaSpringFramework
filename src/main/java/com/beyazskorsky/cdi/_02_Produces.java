package com.beyazskorsky.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "produceTuto")
@ApplicationScoped
public class _02_Produces {

    @Produces
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("Html5");
        liste.add("js");
        liste.add("css3");
        liste.add("react");
        liste.add("vue.js");
        return liste;
    }
}
