package com.poorjar.countries;

/**
 * Created by Swaroop on 10/30/15.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public final class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/countries")
    public List<Country> handleRequest()
    {
        return this.countryRepository.findAll();
    }
}
