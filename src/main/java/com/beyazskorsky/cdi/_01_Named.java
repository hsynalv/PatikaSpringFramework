package com.beyazskorsky.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//cdi => ban
@Named(value = "namedTuto")
@ApplicationScoped // uygulama life cycle boyunca (server kapanana kadar tek bir örnek ile çalış)
//@RequestScoped // Her istek için yeni bir örnek oluştur.
public class _01_Named {

    private Long namedId;
    private String namedData = "Burası Named Cdi Bean";
}
