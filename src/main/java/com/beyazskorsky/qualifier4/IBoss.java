package com.beyazskorsky.qualifier4;


public interface IBoss {
    //@Alternative => Aynı anda sadece bir tane proje çalışıyor diğerleri kapalı
    //@Qualifier => Aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz.
    public String version(String data);
}
