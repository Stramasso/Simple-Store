package com.simplestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login"; // Certifique-se que existe login.html em templates
    }
}

// This controller handles the login page for the application.
// It maps the "/login" URL to the login view, allowing users to access the login form.