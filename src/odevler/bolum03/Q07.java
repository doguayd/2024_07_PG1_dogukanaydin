package odevler.bolum03;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if (numberOfOneDollars == 1) {
            System.out.println(" 1 dollar");
        } else if (numberOfOneDollars == 0) {
            
        } else {
            System.out.println(" " + numberOfOneDollars + " dollars");
        }

        if (numberOfQuarters == 1) {
            System.out.println(" 1 quarter");
        } else if (numberOfQuarters == 0) {
            
        } else {
            System.out.println(" " + numberOfQuarters + " quarters ");
        }
        if (numberOfDimes == 1) {
            System.out.println(" 1 dime");
        } else if (numberOfDimes == 0) {
            
        } else {
            System.out.println(" " + numberOfDimes + " dimes");
        }
        if (numberOfNickels == 1) {
            System.out.println(" 1 nickel");
        } else if (numberOfNickels == 0) {

        } else {
            System.out.println(" " + numberOfNickels + " nickels");
        }
        if (numberOfPennies == 1) {
            System.out.println(" 1 pennie");
        } else if (numberOfPennies == 0) {

        } else {
            System.out.println(" " + numberOfPennies + " pennies");
        }

    }
}

