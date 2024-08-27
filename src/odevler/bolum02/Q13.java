package odevler.bolum02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double savedMoney = input.nextDouble();

        double firstMonth = savedMoney * (1 + 0.00417);
        double secondMonth = (savedMoney + firstMonth) * (1 + 0.00417);
        double thirdMonth = (savedMoney + secondMonth) * (1 + 0.00417);
        double fourthMonth = (savedMoney + thirdMonth) * (1 + 0.00417);
        double fifthMonth = (savedMoney + fourthMonth) * (1 + 0.00417);
        double sixthMonth = (savedMoney + fifthMonth) * (1 + 0.00417);

        System.out.println("After the sixth month, the account value is $" + (int)(sixthMonth * 100) / 100.0);
    }
}
