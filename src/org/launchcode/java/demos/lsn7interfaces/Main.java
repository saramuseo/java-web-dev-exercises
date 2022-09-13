package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        Comparator comparator = new FlavorComparator();
        ConeComparator coneComparator = new ConeComparator();
        ToppingComparator toppingComparator = new ToppingComparator();

        System.out.println("\nFlavors Before: ");

//        for (Flavor flavor : flavors){
//            System.out.println(flavor.getName());
//        }
//        flavors.sort(comparator);
//        for (Flavor flavor : flavors){
//            System.out.println(flavor.getName());
//        }



        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

//        flavors.sort(comparator);
//        System.out.println("\nFlavors After: ");
//        for (Flavor flavor : flavors){
//            System.out.println(flavor.getName());
//        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        cones.sort(coneComparator);

        System.out.println("\nCones After: ");
        for (Cone cone : cones){
            System.out.println(cone.getName() + ": " + cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.



        flavors.sort(comparator);
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName() + ": Contains " + flavor.getAllergens().size() + " allergen(s)");
        }

        toppings.sort(toppingComparator);

        System.out.println("\nToppings by cost: \n");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ": $" + topping.getCost());
        }


    }


}
