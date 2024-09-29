package odevler.bolum05;

public class Q05 {
    public static void main(String[] args) {

        System.out.println("Kilograms\t\tPounds\t|\tPounds\t\tKilograms");

        for (int i = 1, j = 20; i < 200 && j <= 515; i += 2, j += 5) {
            if (i < 4) {
                System.out.println(i + "\t\t\t\t" + (int)((i * 2.2) * 100) / 100.0 + "\t\t|\t" + j + "\t\t\t" +
                        (int)((j / 2.2) * 100) / 100.0);
            } else {
                System.out.println(i + "\t\t\t\t" + (int)((i * 2.2) * 100) / 100.0 + "\t|\t" + j + "\t\t\t" +
                        (int)((j / 2.2) * 100) / 100.0);
            }
        }
    }
}
