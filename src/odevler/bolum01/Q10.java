package odevler.bolum01;

public class Q10 {
    public static void main(String[] args) {
        double km = 14.0, mile = km / 1.6;
        double time = (45 * 60) + 30.0 , totalHour = time / 3600;
        double averageSpeedInMiles = mile / totalHour;
        System.out.println("If a runner runs 14 kilometers in 45 minutes and 30 seconds, runner's average speed in miles is " + averageSpeedInMiles);
    }
}
