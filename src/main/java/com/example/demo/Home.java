package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String home(){
        return "Welcome To my Home Page!! \n Go to my bio page";
    }

    @GetMapping("/bio")
    public String bio(){
        return "Hi! My name is Saransh Gupta. I am pursuing my B.Tech from LNMIIT Jaipur. Right now, I am an ASE intern at Tekion Corp.";
    }
}
