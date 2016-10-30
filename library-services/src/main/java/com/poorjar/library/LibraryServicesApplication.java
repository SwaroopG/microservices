package com.poorjar.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Entry point class of the Library services.
 * 
 * @author Swaroop
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableMongoRepositories(basePackages = "com.poorjar.library.dataaccess")
public class LibraryServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryServicesApplication.class, args);
    }
}