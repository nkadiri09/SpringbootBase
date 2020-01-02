package com.example.SpringbootBase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

@RestController
@RequestMapping(path = "/*")
public class SimpleController {


    @Value("${JAVA_HOME}")
    private String javaHome;

    @Value("${user1.name}")
    private String name;

    @Value("${user1.password}")
    private String password;

    @GetMapping(path ="/myprams", produces = "application/json")
    public String getSimpleParams(){

        System.out.println("Javahome is set to: "+javaHome);

        System.out.println("sample user and password subs:  "+name+ " : "+password);

            return javaHome;
    }

    @Bean
    protected static PropertySourcesPlaceholderConfigurer property(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
