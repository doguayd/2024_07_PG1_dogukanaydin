package odevler.bolum03;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);

        System.out.println(lottery);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        System.out.println("The lottery number is " + lottery);

        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = (lottery % 100) % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = (guess % 100) % 10;

        if (guess == lottery) {
            System.out.println("Exact match: You win $10,000!");
        } else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
                (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) &&
                (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)) {
            System.out.println("Match all digits: You win $3,000!");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 ||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
                guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one digit: You win $1,000!");
        } else {
            System.out.println("You couldn't win :(");
        }
    }
}

