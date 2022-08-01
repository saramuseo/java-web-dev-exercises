package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the rectangle's length:");
        double length = input.nextDouble();

        System.out.println("Please enter the rectangle's width:");
        double width = input.nextDouble();
        input.close();

        System.out.println("The area of the rectangle is " + length*width + ".");
    }
}
