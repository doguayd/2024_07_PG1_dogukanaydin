package odevler.bolum03;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double dollar = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();

        if (convert == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();

            double rmb = dollarAmount * dollar;
            System.out.println("$" + dollarAmount + " is " + rmb + " yuan");
        } else if (convert == 1) {
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();

            double usd = dollarAmount / dollar;
            System.out.println( dollarAmount + " Yuan is $" + (int) (usd * 100) / 100.0);

        } else {
            System.out.println("You entered invalid input");
        }


    }
}
