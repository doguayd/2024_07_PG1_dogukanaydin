package odevler.bolum03;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pc = (int) (Math.random() * 3);

        String[] options = {"scissor", "rock", "paper"};

        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = input.nextInt();

        if (player == pc) {
            System.out.println("The computer is " + options[pc] + ". You are " + options[player] + " too. It is a draw" );
        } else if ((player == 0 && pc == 2) || (player == 1 && pc == 0) || (player == 2 && pc == 1)) {
            System.out.println("The computer is " + options[pc] + ". You are " + options[player] + ". You won" );
        } else {
            System.out.println("The computer is " + options[pc] + ". You are " + options[player] + ". You lost" );
        }

    }
}
