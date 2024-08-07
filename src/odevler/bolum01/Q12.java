package odevler.bolum01;

public class Q12 {
    public static void main(String[] args) {
        double km = 24 * 1.6;
        double hour = ((60 * 60) + (40 * 60) + 35.0) / 3600;
        double average = km / hour;
        System.out.println("If a runner runs 24 miles in 1 hour, 40 minutes and 35 seconds, runners average speed in kilometer per hour is " + average);
    }
}
