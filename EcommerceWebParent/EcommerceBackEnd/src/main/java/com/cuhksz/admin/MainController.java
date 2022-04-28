package com.cuhksz.admin;

import com.cuhksz.admin.database.User;
import com.cuhksz.admin.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
        n.setUsername(name);
        n.setEmail(email);
        n.setPassword(password);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping("/list")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
