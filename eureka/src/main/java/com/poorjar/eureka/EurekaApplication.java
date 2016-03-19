package com.poorjar.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "eureka");
        SpringApplication.run(EurekaApplication.class, args);
    }
}