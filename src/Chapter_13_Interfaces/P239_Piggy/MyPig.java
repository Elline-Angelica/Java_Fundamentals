package Chapter_13_Interfaces.P239_Piggy;

public class MyPig implements Pig{

    @Override
    public void grunt() {
        System.out.println("*The pig made sounds: Knorr Knorr*");

    }

    @Override
    public void fly() {
        System.out.println("*The Pig is now flying*");

    }

}
