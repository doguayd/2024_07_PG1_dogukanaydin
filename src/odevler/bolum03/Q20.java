package odevler.bolum03;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        if ((fahrenheit < -58 || fahrenheit > 41) && (windSpeed < 2)) {
            System.out.println("Fahrenheit is not between -58 and 41, wind speed is invalid.");
        }
        else if (fahrenheit < -58 || fahrenheit > 41) {
            System.out.println("Fahrenheit is not between -58 and 41");
        } else if (windSpeed < 2) {
            System.out.println("Wind speed is invalid.");
        }else {
            double windChill = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
            System.out.println("The wind chill index is " + (int)(windChill * 1000000) / 1000000.0);
        }


    }
}
