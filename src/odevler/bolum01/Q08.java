package odevler.bolum01;

public class Q08 {
    public static void main(String[] args) {
        double Radious = 5.5;
        double Pi = (4 * ((1.0) - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 /11)));
        double perimeter = 2 * Radious * Pi;
        double area = Radious * Radious * Pi;
        System.out.println("A circle that has a radius of 5.5 has " + perimeter + " cm perimeter, and " + area + " cm^2 area.");
    }
}
