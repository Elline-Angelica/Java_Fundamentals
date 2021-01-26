package Chapter_24_Multithreading.Excercises.EXC5_P430;

import java.util.Random;

public class TimeBomb {

    private int durationInSeconds;
    public TimeBomb(int durationInSeconds){
        this.durationInSeconds = durationInSeconds;
    }

    public void activate(){
        for (int i = 10; i >= 0; i--) {
            System.out.println("Timebomb ticking: " + i + " seconds left");
        }
        System.out.println("Boooom!!");
    }

    public void disarm(){
        for (int i = 10; i > 6; i--) {
            System.out.println("Timebomb ticking: " + i + " seconds left");
        }
        System.out.println("Disarmed!!");
    }

}
