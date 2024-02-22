package com.example.crud.springbootblogapplication.controllers;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;


import java.util.Map;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin() {
        System.out.println("Before login");
        return "login";
    }

//    @GetMapping("/login/error")
//    public String getLoginError() {
//        return "error";
//    }

//    @PostMapping("/login")
//    public String afterLogin() {
//        System.out.println("after login");
//        return "redirect:/";
//    }


//    @PostMapping("/logout")
//    public String after_logout() { return  "home"; }
}