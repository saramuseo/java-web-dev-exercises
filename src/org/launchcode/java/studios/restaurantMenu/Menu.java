package org.launchcode.java.studios.restaurantMenu;

import java.util.Date;

public class Menu {
    private String[] category = {"appetizer", "main course", "dessert"};

    public Menu (String[] category){
        this.category = category;
    }

    public String[] getCategory() {
        return category;
    }
    public void setCategory(String[] category) {
        this.category = category;
    }

}
