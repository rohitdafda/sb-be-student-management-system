package com.rohitdafda.studentmanagementsystem.controller;

import com.rohitdafda.studentmanagementsystem.utils.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public MessageResponse<String> index(){
        return new MessageResponse<>(200, "Welcome to the SMS", true, null);
    }
}
