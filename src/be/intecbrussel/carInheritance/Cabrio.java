package be.intecbrussel.carInheritance;

public class Cabrio extends Car{

    private boolean sunroof;

    public void openRoof(){
        this.sunroof = !this.sunroof;
    } //toggle function

    public boolean getRoof(){
        return this.sunroof;
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
