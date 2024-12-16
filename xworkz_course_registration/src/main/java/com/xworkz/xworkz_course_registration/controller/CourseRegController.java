package com.xworkz.xworkz_course_registration.controller;

import com.xworkz.xworkz_course_registration.dto.CourseRegDTO;
import com.xworkz.xworkz_course_registration.service.CourseRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

public class CourseRegController {


    @Autowired
    private CourseRegService service;

    public CourseRegController() {
        System.out.println("No-Args Const of CourseRegController");
    }

    @PostMapping("/signup")
    public String onSave(CourseRegDTO dto, Model model) {
        System.out.println("Executing onSave in Controller");
        String validationMessage = service.validateAndSave(dto);

        if ("Validation successful".equals(validationMessage)) {
            model.addAttribute("success", "");
            return "Response";
        } else {
            model.addAttribute("failure", validationMessage);
            model.addAttribute("fail", "Invalid Data");
            return "SignUp";
        }
    }

    @PostMapping("/signin")
    public String onIn(String email, String password, Model model) {
        System.out.println("Executing onSignIn in Controller");

        String validationMessage = service.verificationUser(email, password);

        if (validationMessage.equals("Verification successed")) {
            String userName = service.getNameByEmail(email);
            model.addAttribute("userName", userName);
            return "Signin";
        } else {

            model.addAttribute("error", "Given email and password do not match");
            return "Signin";
        }
    }

}

