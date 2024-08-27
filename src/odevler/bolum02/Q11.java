package odevler.bolum02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312032486;
        double yearWithSeconds = 365.0*24*60*60;
        double birth = yearWithSeconds / 7;
        double death = yearWithSeconds / 13;
        double immigrant = yearWithSeconds / 45;

        int risingPopulation = (int)(birth + immigrant - death);
        int finalPopulation = years * risingPopulation + population;

        System.out.println("The population in " + years + " years is " + finalPopulation);
    }
}
