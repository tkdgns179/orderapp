package com.example.orderapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String signInForm(Model model) {

        return "sign/sign_in";
    }

    @GetMapping("sign/sign_up")
    public void signUpForm() {}
}
