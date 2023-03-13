package com.poc.adminservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @CrossOrigin(origins = "*")
    @GetMapping("/admin")
    public String user() {
        return "Hello admin";
    }
}