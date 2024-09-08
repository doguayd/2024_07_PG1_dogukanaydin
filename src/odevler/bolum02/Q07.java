package odevler.bolum02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter minute: ");
        int minute = input.nextInt();

        int oneDay = 1440;
        int oneYear = 525600;

        int year = minute / oneYear;
        int day = (minute % oneYear) / oneDay;

        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days.");
    }
}
