package odevler.bolum03;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year(e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month(1-12): ");
        int month = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year --;
        }

        System.out.print("Enter the day of the month(1-31): ");
        int day = input.nextInt();

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        int century = year / 100;
        int yearOfTheCentury = year % 100;

        int futureday = (day + ((26 * (month + 1)) / 10) +  yearOfTheCentury + (yearOfTheCentury / 4) + (century / 4) + (5 * century)) % 7;

        System.out.println("Day of the week is " + days[futureday]);

    }
}
