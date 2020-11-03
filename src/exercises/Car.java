package exercises;

public class Car {

    //30_10_2020

    //1.Beschermde properties maar toegankelijk via methodes
    private int speed;
    private int engine;
    public String color;
    private boolean isLightsOn;

    //2.Constructoren
    public Car(String color) { this.color = color; }
    public Car(int speed,boolean isLightsOn) { this.speed = speed;this.isLightsOn = isLightsOn; }
    public Car(int engine) { this.engine = engine; }

    //2.Getters
    public String getColor() { return color; }
    public int getSpeed() { return speed; }
    public boolean isLightsOn() { return isLightsOn; }
    public int getEngine() { return engine; }

    //2.Settters
    public void setColor(String color) { this.color = color; }
    public void setSpeed(int speed) { if (speed >= 0) { this.speed = speed; } else { System.out.println("Listen.. Let's not make this any more difficult. Just pick a speed greater or equal to zero man.");}}
    public void setLightsOn ( boolean lightsOn){ this.isLightsOn = isLightsOn; }
    public void setEngine(int engine){ this.engine = engine; }


//3.Car functions - Speed not less than 0
//3.Car functions - parkMethod -> speed is zero and lights off
//3.Car functions - remove setter and use rePaint method + show price
//3.Car functions - lightsToggle





//ConstructorChaining & PrintMethod?? idk
// public void printMethod(){}
// Car counter constructor in stead of initial codeblock
// Initial codeblocks?? idk


    //8. Random Utility
    public Car(boolean isLightsOn) { this.speed = RandomGenerator.createRandomSpeed();this.isLightsOn = isLightsOn; }

    //9. Arrays & show parked cars
}

