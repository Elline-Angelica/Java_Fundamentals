package Chapter_06_OOP;

import java.util.Arrays;
import java.util.Random;

public class P115_RandomGeneratorApp {

    public static void main(String[] args) {
        Random rand = new Random();

        //Part1
        int value1 = rand.nextInt(10);
        int value2 = rand.nextInt(100);

        System.out.println("first random number = " + value1);
        System.out.println("second random number = " + value2);
        System.out.println("third random number = " + rand.nextInt(14));

        //Part2
        int[] lotto = new int[6];
        for(int i =0 ; i < 6; i++){
            lotto[i] = rand.nextInt(50);
        }
        System.out.println("The winning lottery numbers are " + Arrays.toString(lotto));



    }

}
