package Chapter_10_Inheritance.P198_Animals;

public class Fish extends Animal {

    //______________constructors______________
    public Fish() {

    }

    public Fish(String name) {
        setName(name);
    }

    //______________methods______________
    @Override
    public String move() {
        return "South";
    }

    @Override
    public String makeNoise() {
        return "blub blub";
    }

    @Override
    public String toString() {
        return "Fish{" +
                " name= " + getName() +
                ", noise= " + makeNoise() +
                ", moved= " + move() +
                "}";

    }
}
