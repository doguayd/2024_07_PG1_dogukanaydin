package odevler.bolum02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double fahrenheit = 0.305 * feet;

        System.out.println(feet + " feet is " + fahrenheit + " meter.");
    }
}
