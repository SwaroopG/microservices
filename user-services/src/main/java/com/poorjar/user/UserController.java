package com.poorjar.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poorjar.user.dataaccess.User;
import com.poorjar.user.dataaccess.UserRepository;

@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users/all")
    public List<User> handleRequest() {
        return this.userRepository.findAll();
    }
}
