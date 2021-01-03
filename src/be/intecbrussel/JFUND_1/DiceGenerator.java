package be.intecbrussel.JFUND_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DiceGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter amount of throws");
        int input;

        do {
            input = sc.nextInt();
        } while (input < 20);

        int offset = 1;

        int[] diceRolls = new int[6];
        Arrays.fill(diceRolls,0);


        for (int i = input; i > 0; i--) {
            diceRolls[random.nextInt(6)]++;
        }

        for (int i = 0; i < diceRolls.length; i++) {
            System.out.printf("Amount of %d rolled: %d. Percentage: %.2f%s.%n", i + offset, diceRolls[i], diceRolls[i] * 100.0 / input, "%");
        }

    }

}
