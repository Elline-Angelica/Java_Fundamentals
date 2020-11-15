package Chapter_10_Inheritance.P198_Animals;

public class Bird extends Animal{

    //______________constructors______________
    public Bird(){

    }

    public Bird(String name){
        setName(name);
    }

    //______________methods______________
    @Override
    public String move() {
        return "East" ;
    }

    @Override
    public String makeNoise() {
        return "tchirp tchirp";
    }


    @Override
    public String toString() {
        return "Bird{" +
                " name= " + getName() +
                ", noise= " + makeNoise() +
                ", moved= " + move() +
                "}";
    }

}
