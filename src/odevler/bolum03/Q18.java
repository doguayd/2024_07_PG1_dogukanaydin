package odevler.bolum03;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your the weight of the package (in pounds): ");
        double weight = input.nextDouble();

//        if (weight < 0) {
//            System.out.println("You entered invalid value.");
//        } else if (weight <= 1) {
//            System.out.println("The cost (in dollars) of shipping based on the weight of the package is " + weight * 3.5 + "$");
//        } else if (weight <= 3) {
//            System.out.println("The cost (in dollars) of shipping based on the weight of the package is " + weight * 5.5 + "$");
//        } else if (weight <= 10) {
//            System.out.println("The cost (in dollars) of shipping based on the weight of the package is " + weight * 8.5 + "$");
//        } else if (weight <= 20) {
//            System.out.println("The cost (in dollars) of shipping based on the weight of the package is " + weight * 10.5 + "$");
//        } else if (weight <= 50) {
//            System.out.println("Please contact the staff.");
//        } else {
//            System.out.println("The package cannot be shipped.");
//        }

        if (weight < 0) {
            System.out.println("You entered invalid value.");
        } else if (weight <= 1) {
            System.out.println("The cost (in dollars) of shipping based on the weight of the package is 3.5$");
        } else if (weight <= 3) {
            System.out.println("The cost (in dollars) of shipping based on the weight of the package is 5.5$");
        } else if (weight <= 10) {
            System.out.println("The cost (in dollars) of shipping based on the weight of the package is 8.5$");
        } else if (weight <= 20) {
            System.out.println("The cost (in dollars) of shipping based on the weight of the package is 10.5$");
        } else if (weight <= 50) {
            System.out.println("Please contact the staff.");
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
