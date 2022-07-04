package com.beyazskorsky.cdi;

import com.beyazskorsky.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newTuto")
@ApplicationScoped
public class _04_New {

    @Produces
    public String producedData(@New StudentDto studentDto){
        studentDto= StudentDto
                .builder()
                .studentId(0L)
                .studentName("Hüseyin")
                .studentSurname("Alav")
                .build();

        return studentDto.getStudentName();
    }
    @Getter
    @Inject
    private String consumingData;

}
