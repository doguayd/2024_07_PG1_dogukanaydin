package odevler.bolum03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int)(Math.random() * 2);

        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

        if (coin == guess) {
            System.out.println("Congrats, your guess is correct.");
        } else {
            System.out.println("Your guess is incorrect.");
        }
    }
}
