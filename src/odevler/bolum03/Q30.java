package odevler.bolum03;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = input.nextInt();

        currentHour += gmt;

        long dayTime = currentHour / 12;
        currentHour %= 12;

        if (dayTime == 0) {
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM");
        } else {
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");
        }


    }
}
