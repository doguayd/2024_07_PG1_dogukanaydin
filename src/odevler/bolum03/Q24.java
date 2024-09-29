package odevler.bolum03;

public class Q24 {
    public static void main(String[] args) {
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

        int randomRank = (int)(Math.random() * 13);
        int randomSuit = (int)(Math.random() * 4);

        System.out.println("The card you picked is " + rank[randomRank] + " of " + suit[randomSuit]);
    }
}
