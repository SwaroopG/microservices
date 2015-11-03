package com.poorjar.countries;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Swaroop on 11/3/15.
 */
public interface CountryRepository extends MongoRepository<Country, String> {

    List<Country> findByName(@Param("name") String name);

}