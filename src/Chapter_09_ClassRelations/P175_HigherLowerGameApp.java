package Chapter_09_ClassRelations;

import java.util.Random;
import java.util.Scanner;

public class P175_HigherLowerGameApp extends P174_HigherLowerGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int toGuess = r.nextInt(2);

        P174_HigherLowerGame object = new P174_HigherLowerGame();

            System.out.println("Enter a number");
            int input = sc.nextInt();

            object.setValue(toGuess);
            System.out.println(guessMethod(input));
        }
    }
