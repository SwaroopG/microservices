package com.poorjar.library.dataaccess;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A library asset.
 * 
 * @author Swaroop
 */
@Document(collection = "asset")
@CompoundIndexes(value = { 
        @CompoundIndex(name = "title_author_idx", def = "{'title':1, 'author':1}", unique = true) })
public class Asset implements Serializable {
    private static final long serialVersionUID = -1347404869613793680L;

    @Id
    private String id;
    private String title;
    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param title the title to set
     */
    public final void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the title
     */
    public final String getTitle() {
        return title;
    }

    /**
     * @param author the author to set
     */
    public final void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the author
     */
    public final String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("Asset[id=%s, title='%s', author='%s']", id, title, author);
    }

}