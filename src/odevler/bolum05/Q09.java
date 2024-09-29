package odevler.bolum05;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String namesAndScores = "";

        String theHighestName = "";
        int highestScore = 0;

        String theSecondHighestName = "";
        int secondHighestScore = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Each student’s name and score");
            String name = input.next();
            int score = input.nextInt();

            namesAndScores += name + " " + score + "\n";

            if (score >= highestScore) {
                secondHighestScore = highestScore;
                theSecondHighestName = theHighestName;

                highestScore = score;
                theHighestName = name;
            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                theSecondHighestName = name;
            }
        }

        System.out.println("List\n" + namesAndScores);

        System.out.println("The highest score is: " + theHighestName + "\t" + highestScore);
        System.out.println("The  second-highest score is: " + theSecondHighestName + "\t" + secondHighestScore);
    }
}
