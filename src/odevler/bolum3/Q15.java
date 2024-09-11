package odevler.bolum3;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        System.out.println("The lottery number is " + lottery);

        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = (lottery % 100) % 10;

        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess %= 100) / 10;
        int guessDigit3 = (guess %= 100) % 10;


        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit1 == lotteryDigit2 && )
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
