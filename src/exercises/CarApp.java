package exercises;

//30_10_2020

public class CarApp {

    public static void main(String[] args) {

        System.out.println("****************************************");
        Car C1 = new Car("Purple");
        String C1Color = C1.getColor();
        System.out.println("The first car color is: "+C1Color);
        System.out.println("Car's original color: " + C1.getColor());
        C1.setColor("Red");
        System.out.println("Car's new color: " + C1.getColor());

        System.out.println("****************************************");
        Car C2 = new Car(true);
        int C2Speed = C2.getSpeed();
        boolean C2Lights = C2.isLightsOn();
        System.out.println("The second car's speed is: " +C2Speed+"km/h");
        System.out.println("The second car's lights are on -> " +C2Lights);
        C2.setSpeed(5);
        System.out.println("New car's speed is: "+ C2.getSpeed()+"km/h");

        System.out.println("****************************************");
        Car C3 = new Car(200);
        int C3Engine = C3.getEngine();
        System.out.println("The third car's engine power is: " +C3Engine+ "hp");
        C3.setEngine(250);
        System.out.println("Car's new engine power is: "+C3.getEngine()+"hp");






    }

}
