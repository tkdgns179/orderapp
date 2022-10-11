package com.example.orderapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String main(Model model) {
        return "sign/sign_in";
    }

    @GetMapping("sign/sing_in")
    public void signInForm () {}

    @GetMapping("sign/sign_up")
    public void signUpForm() {}

    @PostMapping("sign/sign_up")
    public String signUp() {

        return null;
    }
}
