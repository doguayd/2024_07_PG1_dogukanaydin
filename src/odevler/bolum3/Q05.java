package odevler.bolum3;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int presentDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDay = input.nextInt();

        int futureDay = (presentDay + elapsedDay) % 7;

//        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        System.out.println("Today is " + days[presentDay] + " and the future day is " + days[futureDay]);

        if (presentDay == 0) {
            if (futureDay == 0) {
                System.out.println("Today is Sunday and the future day is Sunday.");
            } else if (futureDay == 1) {
                System.out.println("Today is Sunday and the future day is Monday.");
            } else if (futureDay == 2) {
                System.out.println("Today is Sunday and the future day is Tuesday");
            } else if (futureDay == 3) {
                System.out.println("Today is Sunday and the future day is Wednesday.");
            } else if (futureDay == 4) {
                System.out.println("Today is Sunday and the future day is Thursday.");
            } else if (futureDay == 5) {
                System.out.println("Today is Sunday and the future day is Friday.");
            } else if (futureDay == 6) {
                System.out.println("Today is Sunday and the future day is Saturday.");
            }
        } else if (presentDay == 1) {
            if (futureDay == 0) {
                System.out.println("Today is Monday and the future day is Sunday.");
            } else if (futureDay == 1) {
                System.out.println("Today is Monday and the future day is Monday.");
            } else if (futureDay == 2) {
                System.out.println("Today is Monday and the future day is Tuesday");
            } else if (futureDay == 3) {
                System.out.println("Today is Monday and the future day is Wednesday.");
            } else if (futureDay == 4) {
                System.out.println("Today is Monday and the future day is Thursday.");
            } else if (futureDay == 5) {
                System.out.println("Today is Monday and the future day is Friday.");
            } else if (futureDay == 6) {
                System.out.println("Today is Monday and the future day is Saturday.");
            }
        } else if (presentDay == 2) {
            if (futureDay == 0) {
                System.out.println("Today is Tuesday and the future day is Sunday.");
            } else if (futureDay == 1) {
                System.out.println("Today is Tuesday and the future day is Monday.");
            } else if (futureDay == 2) {
                System.out.println("Today is Tuesday and the future day is Tuesday");
            } else if (futureDay == 3) {
                System.out.println("Today is Tuesday and the future day is Wednesday.");
            } else if (futureDay == 4) {
                System.out.println("Today is Tuesday and the future day is Thursday.");
            } else if (futureDay == 5) {
                System.out.println("Today is Tuesday and the future day is Friday.");
            } else if (futureDay == 6) {
                System.out.println("Today is Tuesday and the future day is Saturday.");
            }
        } else if (presentDay == 3) {
            if (futureDay == 0) {
                System.out.println("Today is Wednesday and the future day is Sunday.");
            } else if (futureDay == 1) {
                System.out.println("Today is Wednesday and the future day is Monday.");
            } else if (futureDay == 2) {
                System.out.println("Today is Wednesday and the future day is Tuesday");
            } else if (futureDay == 3) {
                System.out.println("Today is Wednesday and the future day is Wednesday.");
            } else if (futureDay == 4) {
                System.out.println("Today is Wednesday and the future day is Thursday.");
            } else if (futureDay == 5) {
                System.out.println("Today is Wednesday and the future day is Friday.");
            } else if (futureDay == 6) {
                System.out.println("Today is Wednesday and the future day is Saturday.");
            }
        } else if (presentDay == 4) {
            if (futureDay == 0) {
                System.out.println("Today is Thursday and the future day is Sunday.");
            } else if (futureDay == 1) {
                System.out.println("Today is Thursday and the future day is Monday.");
            } else if (futureDay == 2) {
                System.out.println("Today is Thursday and the future day is Tuesday");
            } else if (futureDay == 3) {
                System.out.println("Today is Thursday and the future day is Wednesday.");
            } else if (futureDay == 4) {
                System.out.println("Today is Thursday and the future day is Thursday.");
            } else if (futureDay == 5) {
                System.out.println("Today is Thursday and the future day is Friday.");
            } else if (futureDay == 6) {
                System.out.println("Today is Thursday and the future day is Saturday.");
            }
        } else if (presentDay == 5) {
            if (futureDay == 0) {
                System.out.println("Today is Friday and the future day is Sunday.");
            } else if (futureDay == 1) {
                System.out.println("Today is Friday and the future day is Monday.");
            } else if (futureDay == 2) {
                System.out.println("Today is Friday and the future day is Tuesday");
            } else if (futureDay == 3) {
                System.out.println("Today is Friday and the future day is Wednesday.");
            } else if (futureDay == 4) {
                System.out.println("Today is Friday and the future day is Thursday.");
            } else if (futureDay == 5) {
                System.out.println("Today is Friday and the future day is Friday.");
            } else if (futureDay == 6) {
                System.out.println("Today is Friday and the future day is Saturday.");
            }
        } else if (presentDay == 6) {
            if (futureDay == 0) {
                System.out.println("Today is Saturday and the future day is Sunday.");
            } else if (futureDay == 1) {
                System.out.println("Today is Saturday and the future day is Monday.");
            } else if (futureDay == 2) {
                System.out.println("Today is Saturday and the future day is Tuesday");
            } else if (futureDay == 3) {
                System.out.println("Today is Saturday and the future day is Wednesday.");
            } else if (futureDay == 4) {
                System.out.println("Today is Saturday and the future day is Thursday.");
            } else if (futureDay == 5) {
                System.out.println("Today is Saturday and the future day is Friday.");
            } else if (futureDay == 6) {
                System.out.println("Today is Saturday and the future day is Saturday.");
            }
        }
    }
}
