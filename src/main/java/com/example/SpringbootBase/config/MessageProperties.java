package com.example.SpringbootBase.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Profile({"qa","dev"})
@Setter @Getter
@Configuration
@ConfigurationProperties(prefix = "message.default")
public class MessageProperties {

    private String welcome;
    private String goodbye;

}