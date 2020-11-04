package Chapter8;

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
        Car C2 = new Car(70,true); //or leave speed parameter blank for randomgen
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

        Car car1 = new Car("purple");
        car1.rePaint("red");
        Car car2 = new Car(200);
        car2.speedUp(30);
        Car car3 = new Car(100, false);
        car3.toggleLights();

        System.out.println("Amount of cars made: " + Car.getCounter());







    }

}
