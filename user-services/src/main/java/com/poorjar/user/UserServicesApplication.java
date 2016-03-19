package com.poorjar.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.poorjar.user.dataaccess")
public class UserServicesApplication extends SpringBootServletInitializer {
    private static Class<UserServicesApplication> entryPointClass = UserServicesApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(entryPointClass, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(entryPointClass, UserController.class);
    }
}
