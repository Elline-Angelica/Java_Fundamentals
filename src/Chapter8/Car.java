package Chapter8;

public class Car {

    //30_10_2020

    //1.Beschermde properties maar toegankelijk via methodes
    private int speed;
    private int engine;
    private String color = "white"; //standaard kleur
    private boolean isLightsOn;

    private static int counter = 0;

    //2.Constructoren
    public Car(String color) { this.color = color; }
    public Car(int speed,boolean isLightsOn) { this.speed = speed;this.isLightsOn = isLightsOn; }
    public Car(int engine) { this.engine = engine; }

    //2.Getters
    public String getColor() { return color; }
    public int getSpeed() { return speed; }
    public boolean isLightsOn() { return isLightsOn; }
    public int getEngine() { return engine; }
    public static int getCounter() { return counter;}

    //2.Settters
    public void setColor(String color) { this.color = color; }
    public void setSpeed(int speed) { if (speed >= 0) { this.speed = speed; } else { System.out.println("Listen.. Let's not make this any more difficult. Just pick a speed greater or equal to zero man.");}}
    public void setLightsOn ( boolean lightsOn){ this.isLightsOn = isLightsOn; }
    public void setEngine(int engine){ this.engine = engine;    counter++; }


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

}

