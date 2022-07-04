package com.beyazskorsky.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@RequestScoped
@Getter @Setter
public class JsfBean {

    private String patika;

    public JsfBean() {
        patika="Spring Boot Eğitimi";
    }
}
