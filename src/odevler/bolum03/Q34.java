package odevler.bolum03;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double crossProduct = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);

        if (crossProduct == 0) {
            boolean withinX = (x3 >= Math.min(x1, x2)) && (x3 <= Math.max(x1, x2));
            boolean withinY = (y3 >= Math.min(y1, y2)) && (y3 <= Math.max(y1, y2));

            if (withinX && withinY) {
                System.out.println("(" + x3 + ", " + y3 + ") is on the line segment from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
            } else {
                System.out.println("(" + x3 + ", " + y3 + ") is on the line, but not on the line segment.");
            }
        } else {
            System.out.println("(" + x3 + ", " + y3 + ") is not on the line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        }

    }
}