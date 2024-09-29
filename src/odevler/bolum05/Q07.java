package odevler.bolum05;

public class Q07 {
    public static void main(String[] args) {
        System.out.println("Year\t\tTuition");
        int fourYearsCost = 0;
        double tuition = 10000;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t\t" +(int)(tuition * 100 / 100.0));

            if (i < 5){
                fourYearsCost += tuition;
            }

            tuition += tuition * 0.05;
        }

        System.out.println("Four year cost is $" + fourYearsCost);
    }
}
