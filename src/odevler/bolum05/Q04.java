package odevler.bolum05;

public class Q04 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t\t" + (int) ((i * 1.609) * 10000) / 10000.0);
        }
    }
}
