package com.xworkz.xworkz_course_registration.repository;

import com.xworkz.xworkz_course_registration.entity.CourseRegEntity;

public interface CourseRegRepository {

    public boolean onSend(CourseRegEntity entity);

    CourseRegEntity findByEmail(String email);

}
