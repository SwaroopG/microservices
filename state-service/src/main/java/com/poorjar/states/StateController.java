package com.poorjar.states;

/**
 * Created by Swaroop on 10/30/15.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public final class StateController {
    @RequestMapping("/")
    public String handleRequest() {
        return "Hello Spring Boot! State";
    }
}
