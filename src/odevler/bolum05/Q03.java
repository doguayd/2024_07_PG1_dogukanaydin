package odevler.bolum05;


public class Q03 {
    public static void main(String[] args) {

        System.out.println("Kilograms\t\tPounds");

        for (int i = 1; i <= 199; i += 2) {
            System.out.println(i + "\t\t\t\t" + (int)((i * 2.2) * 100) / 100.0);
        }
    }
}
