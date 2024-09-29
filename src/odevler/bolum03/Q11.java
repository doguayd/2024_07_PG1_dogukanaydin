package odevler.bolum03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(months[month - 1] + " " + year + " had 31 days.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(months[month - 1] + " " + year + " had 30 days.");
        } else {
            if (year % 4 == 0) {
                System.out.println(months[month - 1] + " " + year + " had 29 days.");
            } else {
                System.out.println(months[month - 1] + " " + year + " had 28 days.");
            }
        }
    }
}
