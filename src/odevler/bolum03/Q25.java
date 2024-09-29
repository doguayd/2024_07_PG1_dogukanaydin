package odevler.bolum03;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = (y1 - y2) * x1 - (x1 - x2) * y1;
        double d = y3 - y4;
        double e = -(x3 - x4);
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double test = a * e - b * d;

        if (test == 0){
            System.out.println("The two lines are parallel.");
        } else {
            double x = (e * c - b * f) / test, y = (a * f - d * c) / test;

            System.out.println("x is " + x + " . y is " + y + " .");
        }
    }
}
