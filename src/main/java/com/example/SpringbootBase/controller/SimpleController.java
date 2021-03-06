package com.example.SpringbootBase.controller;

import com.example.SpringbootBase.config.MessageProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/*")
public class SimpleController {

    private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @Value("${user1.name}")
    private String name;

    @Value("${user1.password}")
    private String password;

    @Value("${my.list.values}")
    private List<String> listValues;

    @Autowired
    MessageProperties messageProperties;

    @GetMapping(path ="/myprams", produces = "application/json")
    public String getSimpleParams(){

        logger.info("sample user and password subs:  "+name+ " : "+password);

        logger.info("messageProperties are: "+messageProperties.getWelcome() +" : "+messageProperties.getGoodbye());
        return "javaHome";
    }

    @Bean
    protected static PropertySourcesPlaceholderConfigurer property(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @GetMapping(path ="/myvalues", produces = "application/json")
    public List<String> getvalues(){

        logger.info("ListValues are set to: "+listValues);

        return listValues;
    }

}
