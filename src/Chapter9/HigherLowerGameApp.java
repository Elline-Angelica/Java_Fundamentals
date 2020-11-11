package Chapter9;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGameApp extends HigherLowerGame{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int toGuess = r.nextInt(2);

        HigherLowerGame object = new HigherLowerGame();

            System.out.println("Enter a number");
            int input = sc.nextInt();

            object.setValue(toGuess);
            System.out.println(guessMethod(input));
        }
    }
