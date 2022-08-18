package org.launchcode.java.studios.restaurantMenu;

import java.util.Date;

public class MenuItem {
    private Double price;
    private String description;
    private Date lastUpdated;

    public MenuItem (Double price, String description, Date lastUpdated){
        this.price = price;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    public Double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
