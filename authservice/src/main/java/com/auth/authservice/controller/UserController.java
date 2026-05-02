package com.auth.authservice.controller;

import com.auth.authservice.entity.User;
import com.auth.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.auth.authservice.dto.LoginRequest;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
    return userService.loginUser(request);
    }

    @GetMapping("/profile")
    public String profile() {
        return "Protected Profile Access";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return "Admin Access Granted";
    }

}
