package odevler.bolum3;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(Math.random() * 10);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
        int number = input.nextInt();

        System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + number + " is " + (number1 + number2 +
                number3 == number));
    }
}
