package odevler.bolum03;


public class Q16 {
    public static void main(String[] args) {

        int randomXCoordinate = (int) (Math.random() * 100) - 50;
        int randomYCoordinate = (int) (Math.random() * 200) - 100;

        System.out.println("Random coordinate in the rectangle: " + randomXCoordinate + ", " + randomYCoordinate);
    }
}
