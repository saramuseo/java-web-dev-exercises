package org.launchcode.java.demos.lsn6inheritance;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

     HouseCat spike = new HouseCat("Spike");
     System.out.println(spike.getWeight());

    // Cat salem = new Cat(8) ;
    }
}
