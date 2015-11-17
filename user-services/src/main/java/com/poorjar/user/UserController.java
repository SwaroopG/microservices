package com.poorjar.user;

import com.poorjar.user.dataaccess.User;
import com.poorjar.user.dataaccess.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class UserController {
    private static Logger LOGGER = Logger.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users/all")
    public List<User> handleRequest() {
        return this.userRepository.findAll();
    }


    /**
     * Creates users with the provided info.
     *
     * @param users The users to be created.
     * @return Collection of newly created users.
     */
    @RequestMapping(value = "/users/create", method = RequestMethod.POST)
    public Collection<User> create(@RequestBody Collection<User> users) {
        LOGGER.error(users);
        return this.userRepository.save(users);
    }

}
