package odevler.bolum01;

public class Q11 {
    public static void main(String[] args) {
        int population = 312032486;
        double year_with_seconds = 365.0*24*60*60;
        double birth = year_with_seconds / 7;
        double death = year_with_seconds / 13;
        double immigrant = year_with_seconds / 45;
        System.out.println("In one year later population will increase "+ (int)(birth +immigrant - death) + " and new population will be " + (int)(population + (birth +immigrant - death)));
        System.out.println("In two year later population will increase "+ (int)(2 * (birth +immigrant - death)) + " and new population will be " + (int)(population + 2 * (birth +immigrant - death)));
        System.out.println("In three year later population will increase "+ (int)(3 * (birth +immigrant - death)) + " and new population will be " + (int)(population + 3 * (birth +immigrant - death)));
        System.out.println("In four year later population will increase "+ (int)(4 * (birth +immigrant - death)) + " and new population will be " + (int)(population + 4 * (birth +immigrant - death)));
        System.out.println("In five year later population will increase "+ (int)(5 * (birth +immigrant - death)) + " and new population will be " + (int)(population + 5 * (birth +immigrant - death)));

    }
}
