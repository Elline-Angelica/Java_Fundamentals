package be.intecbrussel.carInheritance;

public class Cabrio extends Car{

    private boolean sunroof;

    public void openRoof(boolean toggle){
        this.sunroof = toggle;
    }

    public boolean getRoof(){
        return sunroof;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Cabrio{" +super.toString()+
                "sunroof=" + sunroof +
                '}';
    }
}
