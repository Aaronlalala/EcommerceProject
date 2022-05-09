package com.cuhksz.admin.controller;

import com.cuhksz.admin.controller.form.LoginUser;
import com.cuhksz.admin.controller.form.RegisterUser;
import com.cuhksz.admin.entity.User;
import com.cuhksz.admin.repository.MakeAdvertisementRelationRepository;
import com.cuhksz.admin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;
    private MakeAdvertisementRelationRepository adRelationRepository;

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
        n.setEmail(email);
        n.setCreatedAt(new Date(System.currentTimeMillis()));
        userRepository.save(n);
        return "Saved";
    }

    @PostMapping(path="/register")
    public @ResponseBody Object registerUser(@ModelAttribute RegisterUser formData) {
        User n = new User();
        n.setEmail(formData.getEmail());
        n.setPassword(formData.getPassword());
        n.setFullName(formData.getName());
        n.setBankAccount("");
        n.setCreatedAt(new Date(System.currentTimeMillis()));
        return userRepository.save(n);
    }

    @PostMapping(path = "/login")
    public @ResponseBody Object loginUser(@ModelAttribute LoginUser formData) {
        Optional<User> res = userRepository.findUserByEmail(formData.getEmail());
        if (!res.isEmpty()) {
            if (res.get().checkPassword(formData.getPassword())) {
                return "Success";
            } else {
                return "Wrong password";
            }
        }
        return "No such user";
    }

    @GetMapping("/list")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
