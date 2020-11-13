package Chapter_A_4_ProgrammingLogic;

import java.util.Random;
import java.util.*;

public class P42_HigherLower {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var rand = new Random();
        var numberToGuess = rand.nextInt(10);


        System.out.println("Enter a number:");
        var guessed = false;
        while (!guessed) {
            var guess = keyboard.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else if (guess > numberToGuess) {
                 System.out.println("Lower!");
            } else {
                    System.out.println("Ya guessed right!");
                    guessed = true;
                }

            }

        }
    }

