package be.intecbrussel.carInheritance;

public class SUV extends Car{

    private boolean bullbar;
    private boolean offRoading;

    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void offRoadDriving(boolean bool){ //4x4
        this.offRoading = bool;
    }

    @Override
    public int getSpeed() {
        if (offRoading && super.getSpeed()> 30){
            super.setSpeed(30);
        }
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() +
                "bullbar=" + bullbar +
                ", offRoading=" + offRoading +
                '}';
    }
}
