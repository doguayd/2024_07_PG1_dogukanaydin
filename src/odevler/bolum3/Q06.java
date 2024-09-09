package odevler.bolum3;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;

        System.out.print("Enter feet: ");
        double height = input.nextDouble() * 0.3048;

        System.out.print("Enter inches: ");
        height += input.nextDouble() * 0.0254;

        double bmi = weight / (height * height);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
        System.out.println("Obese");
    }
}
