package com.poorjar.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Entry point class of the Library services.
 * 
 * @author Swaroop
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.poorjar.library.dataaccess")
public class LibraryServicesApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(LibraryServicesApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AssetsController.class, RentalsController.class);
    }
}