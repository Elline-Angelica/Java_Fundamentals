package be.intecbrussel.givenExcercises;

public class Car {

    //30_10_2020

    //1.Private properties but accessible via methods
    private static int counter = 0;
    private int speed;
    private int engine;
    private String color; //= "white"; //standard color
    private boolean isLightsOn;


    //2.Constructors
    public Car() {
        this(0, 100, "white", false);
    }

    public Car(String color) {
        this(0, 100, color, false);
    }

    public Car(int engine) {
        this(0,engine,"white",false);
    }

    public Car(int speed, int engine, String color, boolean isLightsOn) {
        this.speed = speed;
        this.engine = engine;
        this.color = color;
        this.isLightsOn = isLightsOn;
        counter++;
    }

    //2.Getters
    public String getColor() { return color; }
    public int getSpeed() { return speed; }
    public boolean isLightsOn() { return isLightsOn; }
    public int getEngine() { return engine; }
    public static int getCounter() { return counter;}

    //2.Setters
    public void setColor(String color) { this.color = color; }
    public void setSpeed(int speed) { if (speed >= 0) { this.speed = speed; } }
    public void setLightsOn ( boolean lightsOn){ this.isLightsOn = isLightsOn; }
    public void setEngine(int engine){ this.engine = engine;    counter++; }

    //Additional Methods
    public void slowDown(int speedDifference) {
        this.speed = speed-speedDifference<0?0:speed-speedDifference;
        System.out.println("The car is now driving at " + speed + " km/h");
    }

    public void speedUp(int speedDifference){
        this.speed += speedDifference;
        System.out.println("The car is now driving at " + speed + " km/h");
    }

    public void park() {
        this.speed = 0;
        this.isLightsOn = false;
        System.out.println("Car is parked, lights are off");
    }

    public void rePaint(String color) {
        int cost = 0;

        for (char c: color.toCharArray()) {
            cost += c;
        }

        System.out.println("This paint job will cost: " + cost);
        System.out.println("The car was " + this.color);
        this.color = color;
        System.out.println("This car is now painted " + color);
    }

    public void toggleLights() {
        this.isLightsOn = !isLightsOn;
        System.out.println("Are the lights on? " + isLightsOn);
    }

    public void print() {
        System.out.println("Color: " + this.color + " Speed: " + this.speed + ", Light status: " + this.isLightsOn);
    }

}

