package be.intecbrussel.carInheritance;

public class Car {

    //gemaakt met Cal, Anthony & Shelbatra

    private String color;
    private int speed;
    private int hp;

    //__________________INSTANCE METHODS__________________
    public void accelerater(int amount){
        if(amount < 0){
            slow(-amount);
        }else {
            this.speed += (amount + (hp / 100));
        }
    }

    public void slow(int amount){
        if(amount < 0){
            accelerater(-amount);
        }else {
            this.speed -= (amount + (hp / 100));
        }
    }

    public void park(){
        this.speed = 0;
    }

    //______________________SETTERS________________________
    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHp(int amount){
        this.hp = hp;
    }

    //______________________GETTERS________________________
    public String getColor(){
        return this.color;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car: " +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp + " ";
    }
}
