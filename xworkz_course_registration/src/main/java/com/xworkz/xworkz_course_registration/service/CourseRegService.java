package com.xworkz.xworkz_course_registration.service;

import com.xworkz.xworkz_course_registration.dto.CourseRegDTO;

public interface CourseRegService {

    public String validateAndSave(CourseRegDTO dto);

    String verificationUser(String email, String password);

    String getNameByEmail(String email);
}
