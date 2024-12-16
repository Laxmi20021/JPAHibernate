package com.xworkz.xworkz_course_registration.service;

import com.xworkz.xworkz_course_registration.dto.CourseRegDTO;
import com.xworkz.xworkz_course_registration.entity.CourseRegEntity;
import com.xworkz.xworkz_course_registration.repository.CourseRegRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseRegServiceImpl implements CourseRegService {
    @Autowired
    private CourseRegRepository repository;

    public CourseRegServiceImpl() {
        System.out.println("No-Args Const of CourseRegServiceImpl");
    }

    @Override
    public String validateAndSave(CourseRegDTO dto) {

        System.out.println("Executing validateAndSave in ServiceImpl");
        System.out.println("Service" + dto.toString());

        String error = "Validation Success";

        if (dto != null) {
            String name = dto.getName();
            if (name.length() < 10 || !name.matches("^[a-zA-Z0-9]*$")) {
                error = "Invalid Name";
            } else {
                int age = dto.getAge();
                if (age <= 18) {
                    error = "Invalid Age";
                } else {
                    String email = dto.getEmail();
                    if (!email.contains("@") || !email.endsWith("gmail.com")) {
                        error = "Invalid Email";
                    } else {
                        String password = dto.getPassword();
                        if (password.length() < 7 || !password.matches(".*[^a-zA-Z0-9].*")) {
                            error = "Invalid Password";
                        } else {
                            String cPassword = dto.getConfirmPassword();
                            if (!cPassword.equals(password)) {
                                error = "Invalid Confirm Password";
                            } else {
                                CourseRegEntity entity = new CourseRegEntity();
                                entity.setName(dto.getName());
                                entity.setEmail(dto.getEmail());
                                entity.setAge(dto.getAge());
                                entity.setPassword(dto.getPassword());
                                entity.setConfirmPassword(dto.getConfirmPassword());

                                repository.onSend(entity);
                                error = "Validation successful";
                            }
                        }
                    }
                }
            }
        }

        return error;
    }

    @Override
    public String verificationUser(String email, String password) {
        System.out.println("Executing verificationUser in serviceImpl");

        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            System.out.println("Email or password is empty.");
            return "Verification failed";
        }

        CourseRegEntity entity = repository.findByEmail(email);
        if (entity == null) {
            System.out.println("No user found with email: " + email);
            return "Verification failed";
        }

        System.out.println("User found: " + entity.getEmail());

        if (entity.getPassword().equals(password)) {
            System.out.println("Password matches");
            return "Verification successed";
        } else {
            System.out.println("Password does not match");
            return "Verification failed";
        }
    }




    @Override
    public String getNameByEmail(String email) {
        CourseRegEntity entity = repository.findByEmail(email);

        if (entity != null && entity.getName() != null && !entity.getName().isEmpty()) {
            return entity.getName();
        } else {
            System.out.println("No user found with the given email.");
            return null;
        }
    }
}
