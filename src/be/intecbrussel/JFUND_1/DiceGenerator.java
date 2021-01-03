package be.intecbrussel.JFUND_1;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DiceGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter amount of throws");
        int input = sc.nextInt();

        while(input<20){
            System.out.println("Enter amount 20 or more");
        }

        //if (input < 20) { input = 20; }
        //System.out.println("Selected amount of throws: " + input);

        int result;
        for (int i = 0; i < input; i++) {
            result = random.nextInt(6);
            result++;
            System.out.println("Die result : " + result);
        }

        int[] diceRolls = new int[6];
        Arrays.fill(diceRolls,0);




    }

}
