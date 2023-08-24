package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius;
        boolean keepChecking = true;


        while (keepChecking) {
            if (input.hasNextDouble()) {
                radius = input.nextDouble();

                while (radius < 0) {
                    System.out.println("Enter a positive number: ");
                    if (!input.hasNextDouble()) {
                        String string = input.next();
                        System.out.println("'" + string + "'" + " is not a number. Enter a number: ");
                    }
                    radius = input.nextDouble();
                }
                input.close();
                double area = Circle.getArea(radius);
                System.out.println(String.format("The area of a circle of radius %s is: %s", radius, area));
                keepChecking = false;
            } else {
                String string = input.next();
                System.out.println("'" + string + "'" + " is not a number. Enter a number: ");
            }
        }
    }
}
