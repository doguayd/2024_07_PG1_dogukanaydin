package odevler.bolum02;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 1156: ");
        double amount = input.nextDouble();

        int numberOfOneDollars = (int) (amount / 100);
        amount = amount % 100;

        int numberOfQuarters = (int) (amount /25);
        amount = amount % 25;

        int numberOfDimes = (int) (amount / 10);
        amount = amount % 10;

        int numberOfNickels = (int) (amount / 5);
        amount = amount % 5;

        int numberOfPennies = (int) (amount / 1);

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
