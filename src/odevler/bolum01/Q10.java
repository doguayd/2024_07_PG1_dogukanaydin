package odevler.bolum01;

public class Q10 {
    public static void main(String[] args) {
        double km = 14.0, mile = km / 1.6;
        double time = (45 * 60) + 30.0 , total_hour = time / 3600;
        double average_speed_in_miles = mile / total_hour;
        System.out.println("If a runner runs 14 kilometers in 45 minutes and 30 seconds, runner's average speed in miles is " + average_speed_in_miles);
    }
}
