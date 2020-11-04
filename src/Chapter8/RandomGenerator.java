package Chapter8;

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

    //*****************************************************************

    //public static Color getRandomColor(String color) {
    //    Random random = new Random(); // Probably really put this somewhere where it gets executed only once
    //    int red = random.nextInt(256);
    //    int green = random.nextInt(256);
    //    int blue = random.nextInt(256);
    //    return new Color(red, green, blue);
    }







