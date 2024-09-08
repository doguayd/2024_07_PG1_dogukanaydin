package odevler.bolum02;

import java.util.Scanner;

public class Q08 {
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
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond );
    }
}
