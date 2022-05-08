package com.cuhksz.admin.controller;

import com.cuhksz.admin.entity.User;
import com.cuhksz.admin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.sql.Date;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

// Handle the HTTP GET request to the admin page of the application.
    @GetMapping(value="/homepage")
    public String viewHomePage() {
        return "index";
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email, @RequestParam String password) {
        User n = new User();
        n.setFullName(name);
        n.setPassword(password);
        n.setCreatedAt(new Date(System.currentTimeMillis()));
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping("/list")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
