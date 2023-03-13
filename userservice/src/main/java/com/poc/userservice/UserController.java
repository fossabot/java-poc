package com.poc.userservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @CrossOrigin(origins = "*")
    @GetMapping("/user")
    public String user() {
        return "Hello user";
    }
}