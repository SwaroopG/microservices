package com.poorjar.library.dataaccess;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A library rental.
 * 
 * @author Swaroop
 */
@Document(collection = "rental")
@CompoundIndexes(value = { 
        @CompoundIndex(name = "asset_rental_idx", def = "{'assetId':1, 'userId':1}", unique = true) })
public class Rental implements Serializable {
    private static final long serialVersionUID = -2905620528655806547L;
    @Id
    private String id;
    private String assetId;
    private String userId;
    private String date;
    private int period; // in days

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the assetId
     */
    public final String getAssetId() {
        return assetId;
    }

    /**
     * @param assetId the assetId to set
     */
    public final void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * @return the userId
     */
    public final String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public final void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the date
     */
    public final String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public final void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the period
     */
    public final int getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public final void setPeriod(int period) {
        this.period = period;
    }

    @SuppressWarnings("boxing")
    @Override
    public String toString() {
        return String.format("Rental[id=%s, assetId='%s', userId='%s', date='%s', period='%d']", id, assetId, userId, date,
                period);
    }

}