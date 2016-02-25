package com.poorjar.library.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Swaroop on 11/22/15.
 */
public interface DvdRepository extends MongoRepository<Dvd, String> {
}
