package com.springboot.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "plain-login";
    }

    @GetMapping("/accessDenied")
    public String showAccessDenied(){
        return "accessDenied";
    }
}
