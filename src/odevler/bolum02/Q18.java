package odevler.bolum02;

public class Q18 {
    public static void main(String[] args) {

        System.out.println("a\tb\tpow(a, b)");
        int a = 1, b = 2;

        while (a != 6) {
            System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a, b));
            a++;
            b++;
        }
    }
}
