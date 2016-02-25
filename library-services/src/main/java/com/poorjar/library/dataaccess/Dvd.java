package com.poorjar.library.dataaccess;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by Swaroop on 11/22/15.
 */
@Document(collection="dvd")
public class Dvd implements Serializable {
    @Id
    private String id;
    private String title;
    private String rating;
    private long price;

    Dvd (){}

    public Dvd(String id, String title, String rating, long price) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("Dvd [id=%s, title=%s, rating=%s, price=%d]", id, title, rating, price);
    }
}
