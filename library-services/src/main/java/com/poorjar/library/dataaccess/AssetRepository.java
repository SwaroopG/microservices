package com.poorjar.library.dataaccess;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository that exposes APIs to find assets based on title, id etc. <br/>
 * <b>Note</b>: <a href=" http://projects.spring.io/spring-data-mongodb/">Spring-Data-MongoDB</a> used by this project
 * creates an on the fly implementation for the following interface when the application is run. <br/>
 * 
 * @see <a href=" http://projects.spring.io/spring-data-mongodb/">Spring-Data-MongoDB</a>
 * @author Swaroop
 */
public interface AssetRepository extends MongoRepository<Asset, String> {

    public Collection<Asset> findByTitle(String title);
}
