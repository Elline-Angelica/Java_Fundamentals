package be.intecbrussel.associations_aggregations.Part2;

import java.util.Random;

public class RandomGenerator {

    public static int getRandomNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

}
