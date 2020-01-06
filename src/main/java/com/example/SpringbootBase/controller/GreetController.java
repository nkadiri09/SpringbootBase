package com.example.SpringbootBase.controller;

import com.example.SpringbootBase.config.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

   @Autowired
    MessageProperties messageProperties;

    @RequestMapping("/welcome")
    public String welcome() {
        return messageProperties.getWelcome();
    }

    @RequestMapping("/bye")
    public String bye() {
        return messageProperties.getGoodbye();
    }

}