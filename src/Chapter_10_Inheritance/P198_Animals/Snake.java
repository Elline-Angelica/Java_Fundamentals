package Chapter_10_Inheritance.P198_Animals;

public class Snake extends Animal {

    //______________constructors______________
    public Snake(){

    }

    public Snake(String name){
        setName(name);
    }

    //______________methods______________
    @Override
    public String move() {
        return "West";
    }

    @Override
    public String makeNoise() {
        return "hissssssss";
    }

    @Override
    public String toString() {
        return "Snake{" +
                " name= " + getName() +
                ", noise= " + makeNoise() +
                ", moved= " + move() +
                "}";
    }
}
