package odevler.bolum03;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ((x <= 200) && (y <= 100) && (x / y >= 2) && (0 <= x) && (0 <= y)) {
            System.out.println("The point is in the triangle.");
        } else {
            System.out.println("The point is not in the triangle.");
        }
    }
}
