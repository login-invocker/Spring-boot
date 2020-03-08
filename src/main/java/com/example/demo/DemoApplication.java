package com.example.demo;

import com.example.demo.Entity.User;
import com.example.demo.Services.GetUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
        GetUserService userService=context.getBean(GetUserService.class);

    }

}
