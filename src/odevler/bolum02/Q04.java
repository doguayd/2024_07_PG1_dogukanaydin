package odevler.bolum02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pound = input.nextDouble();

        double Kilogram = 0.454 * pound;

        System.out.println(pound + " pounds is " + Kilogram + " kilograms.");
    }
}
