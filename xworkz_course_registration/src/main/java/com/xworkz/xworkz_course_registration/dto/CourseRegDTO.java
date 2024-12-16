package com.xworkz.xworkz_course_registration.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CourseRegDTO {

    private int id;

    private String name;

    private String email;

    private int age;

    private String password;

    private String confirmPassword;

    public CourseRegDTO(String name, String email, int age, String password, String confirmPassword) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

}
