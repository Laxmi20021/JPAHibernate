package com.xworkz.xworkz_course_registration.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="course_reg_table")
@Data
@NoArgsConstructor
@NamedQuery(name = "getByEmail", query = "SELECT ce FROM CourseRegEntity ce WHERE ce.email = :byemail")
public class CourseRegEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private int age;

    private String password;

    private String confirmPassword;

    public CourseRegEntity(String name, String email, int age, String password, String confirmPassword) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
