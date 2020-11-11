package be.intecbrussel.carInheritance;

public class SUV extends Car{

    private boolean bullbar;
    private boolean offRoading;

    public boolean isBullbar() {
        return bullbar;
    }

    public boolean getBullbar(){
        return this.bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void offRoadDriving(boolean bool){ //4x4
        this.offRoading = bool;
        //if(offRoading && getSpeed() > 30) {
        //this.speed -= (amount + (hp/100));
        //amount = (hp/100) = speed - 30;
        //amount = speed - 30 - (hp/100)
        //slow();
    }

    @Override
    public int getSpeed() { //normally there's no setSpeed in given UML
        if (offRoading && super.getSpeed()> 30){
            super.setSpeed(30);
        }
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() +
                "bullbar=" + bullbar +
                ", offRoading=" + offRoading + "}";
    }
}
