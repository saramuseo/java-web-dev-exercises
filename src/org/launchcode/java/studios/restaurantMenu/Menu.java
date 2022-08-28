package org.launchcode.java.studios.restaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void addMenuItem (itemOnMenu){
        this.menuItems.add(itemOnMenu);
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


//   // public Menu (String[] category){
//        this.category = category;
//    }
//
//    public String[] getCategory() {
//        return category;
//    }
//    public void setCategory(String[] category) {
//        this.category = category;
//    }

}
