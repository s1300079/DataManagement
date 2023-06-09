import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.print("> ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int totalValue = dice1 + dice2;

        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);

        System.out.println("Total Value: " + totalValue);

        sc.close();
    }
}