package odevler.bolum03;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter a three-digit integer: ");
//        String number = input.next();

//        char firstDigit = number.charAt(0);
//        char thirdDigit = number.charAt(2);
//
//        if (firstDigit == thirdDigit) {
//            System.out.println(number + " is a palindrome.");
//        } else {
//            System.out.println(number + " is not a palindrome.");
//        }
          System.out.print("Enter a three-digit integer: ");
          int number = input.nextInt();

          int firstDigit = number / 100;
          int enteredNumber = number;
          number %= 100;
          int thirdDigit = number % 10;

          if (firstDigit == thirdDigit){
              System.out.println(enteredNumber + " is a palindrome.");
          } else {
              System.out.println(enteredNumber + " is not a palidrome.");
          }
    }
}
