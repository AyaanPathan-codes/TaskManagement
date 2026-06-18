package com.ayaan.BasicAuth.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public String registerUser(){

        return "User Registered Successfully";
    }
}
