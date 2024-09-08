package odevler.bolum02;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double initialVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double time = input.nextDouble();

        double averageAcceleration = (finalVelocity - initialVelocity) / time;

        System.out.println("The average acceleration is " + (int) (averageAcceleration * 10000) / 10000.0);

    }
}
