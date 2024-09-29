package odevler.bolum05;

public class Q06 {
    public static void main(String[] args) {

        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");

        for (int i = 1, j = 20; i < 10 && j <= 65; i++, j += 5) {
            System.out.println(i + "\t\t\t" + (int) ((i * 1.609) * 10000) / 10000.0 + "\t\t|\t" + j + "\t\t\t\t" +
                        (int)((j / 1.609) * 10000) / 10000.0);
        }
    }
}
