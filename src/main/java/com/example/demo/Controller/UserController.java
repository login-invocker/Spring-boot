package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Services.GetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    GetUserService uService;

            @GetMapping("/user/{id}")
        public User getUser(@PathVariable int id){
                return uService.findById(id);
            }
            @PostMapping("/user")
    public  void addUser(@ModelAttribute User user){
               uService.addU(user);

            }

    }
