package odevler.bolum05;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");

        int positiveNumber = 0;
        int negativeNumber = 0;
        double total = 0;
        double average = 0;
        int turn = 1;

        int number;
        do {
            number = input.nextInt();

            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else if (number == 0) {
                System.out.println("No numbers are entered except 0.");
                System.exit(0);
            }

            total += number;
            average += (number * 1.0 / turn);
        } while (number != 0);

        System.out.println("The number of positives is " + positiveNumber);
        System.out.println("The number of negatives is " + negativeNumber);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

    }
}
