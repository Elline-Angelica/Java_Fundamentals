package be.intecbrussel.classRelations.Part2;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", new Color("White"), new Person("Myself", 40));

        Car car2 = new Car("BMW", new Color("Black"), new Person("Sophie", 20));

        car1.getEngine().setFuel(40);
        car2.getEngine().setFuel(60);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();
        Car car3 = new Car("Mercedes", new Color("White"));

        car3.accelerate(20); // You can not drive the car without a driver!
        car3.setDriver(new Person("Sophie", 21));
        car3.accelerate(20); // You run out of fuel! Please fill up the fuel tank.
        car3.getEngine().setFuel(10);
        car3.accelerate(20); // You don't have enough fuel!
        car3.getEngine().reFuel(10);
        car3.accelerate(20); // Drive safe!

        System.out.println();
        Car car4 = new Car(4);
        car4.addPassenger(new Person("Mommy", 40));
        car4.addPassenger(new Person("Daddy", 50));
        car4.addPassenger(new Person("Myself", 19));
        car4.addPassenger(new Person("Terry", 16));
        car4.getPassengers();

        System.out.println();
        car4.sortPassengers();
        car4.getPassengers();


    }
}
