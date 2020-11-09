package be.intecbrussel.carInheritance;

public class ElektrischeWagen extends Car {

    private int battery;

    @Override
    public void accelerater(int amount) {
        super.setSpeed(super.getSpeed()+(amount+(battery/100)));
    }

    @Override
    public void slow(int amount) {
        super.setSpeed(super.getSpeed()-(amount+(battery/100)));
    }

    public void charge(int amount) {
        this.battery = amount;  //om op te laden this.batter += amount
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public void park() {
        super.park();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }


    @Override
    public String toString() {
        return "ElektrischeWagen{" + super.toString() +
                "battery=" + battery +
                '}';
    }
}
