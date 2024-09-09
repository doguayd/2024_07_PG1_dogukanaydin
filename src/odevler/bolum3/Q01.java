package odevler.bolum3;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminantOfTheQuadratic = (b * b) - (4 * a * c);

        if (discriminantOfTheQuadratic > 0){
            double root1 = (-b + Math.pow(discriminantOfTheQuadratic, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminantOfTheQuadratic, 0.5)) / (2 * a);

            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (discriminantOfTheQuadratic == 0) {
            double root = (-b + Math.pow(discriminantOfTheQuadratic, 0.5)) / (2 * a);

            System.out.println("The equation has one root " + root);
        }else {
            System.out.println("The equation has no real roots.");
        }
    }
}
