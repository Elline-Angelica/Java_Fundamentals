package exercises;

import java.util.Random;

public class RandomGenerator {

    public static int createRandomSpeed(){
        int speed = getRandomNumber(100,300);
        return speed;
    }

    public static int getRandomNumber(int minimum,int maximum){
        Random number = new Random();
        return number.nextInt(maximum-minimum)+minimum;
    }

}
