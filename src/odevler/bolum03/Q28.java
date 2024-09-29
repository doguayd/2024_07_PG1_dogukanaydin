package odevler.bolum03;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double leftX1 = x1 - (width1 / 2);
        double rightX1 = x1 + (width1 / 2);
        double topY1 = y1 + (height1 / 2);
        double bottomY1 = y1 - (height1 / 2);

        double leftX2 = x2 - (width2 / 2);
        double rightX2 = x2 + (width2 / 2);
        double topY2 = y2 + (height2 / 2);
        double bottomY2 = y2 - (height2 / 2);

        if ((leftX1 <= leftX2) && (rightX2 <= rightX1) && (topY2 <= topY1) && (bottomY1 <= bottomY2)) {
            System.out.println("r2 is inside r1.");
        } else if ((rightX1 >= leftX2) && (leftX1 <= rightX2) && (topY1 >= bottomY2) && (bottomY1 <= topY2)) {
            System.out.println("r2 overlaps r1.");
        } else {
            System.out.println("r2 does not overlap r1.");
        }
    }
}
