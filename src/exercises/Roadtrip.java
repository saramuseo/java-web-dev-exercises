package exercises;

import java.util.Scanner;

public class Roadtrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed?");
        double gallons = input.nextDouble();
        input.close();

        System.out.println("Your car gets " + miles/gallons + " miles/gallon.");
    }
}
