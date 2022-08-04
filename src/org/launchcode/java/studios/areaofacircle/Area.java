package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        if (radius <0){
            System.out.println("Incorrect, sorry, bye");
        }
        /*else if (this.radius.getClass().getName() = ""){
            System.out.println("This is empty, sorry, bye");
        }*/
        else if (radius > 0) {
            area = Circle.getArea(radius);
            //area = pi*radius*radius;
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
    }

}
