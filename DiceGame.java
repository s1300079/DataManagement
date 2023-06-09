import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Rolling dice...");

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int totalValue = dice1 + dice2;

        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);

        System.out.println("Total Value: " + totalValue);
    }
}