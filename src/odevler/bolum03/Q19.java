package odevler.bolum03;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three edges for a triangle: ");

        double edge1 = input.nextDouble();

        while (edge1 <= 0){
            System.out.println("Invalid value please enter a positive numbers: ");
            edge1 = input.nextDouble();
        }
        double edge2 = input.nextDouble();
        while (edge2 <= 0){
            System.out.println("Invalid value please enter a positive numbers: ");
            edge2 = input.nextDouble();
        }
        double edge3 = input.nextDouble();
        while (edge3 <= 0){
            System.out.println("Invalid value please enter a positive number: ");
            edge3 = input.nextDouble();
        }

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge1 + edge3 > edge2){
            System.out.println("The perimeter of the triangle is " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("Such a triangle cannot be formed.");
        }

    }
}
