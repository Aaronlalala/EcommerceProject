package com.cuhksz.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

// Handle the HTTP GET request to the admin page of the application.
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
}
