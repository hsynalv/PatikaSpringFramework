package com.beyazskorsky.aop.stereotype;

import lombok.*;

@MyStereotype
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StereoTypeBean {

    private Long id;
    private String name = "Hüseyin alav";
    private String trade;

}
