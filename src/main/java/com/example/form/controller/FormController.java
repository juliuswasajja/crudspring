package com.example.form.controller;

import com.example.form.service.UserService;
import com.example.form.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup")
public class FormController {

    @Autowired
    UserService userService;

    @PostMapping()
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);

    }


}
