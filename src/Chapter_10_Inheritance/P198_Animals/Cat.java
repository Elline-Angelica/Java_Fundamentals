package Chapter_10_Inheritance.P198_Animals;

public class Cat extends Animal{

    //______________constructors______________
    public Cat(){

    }

    public Cat(String name){
        setName(name);
    }

    //______________methods______________
    @Override
    public int move() {
        return 0;
    }

    @Override
    public String makeNoise() {
        return "meowwwww";
    }

    @Override
    public String toString() {
        return "Cat{" +
                " name= " + getName() +
                ", noise= " + makeNoise() +
                "}";
    }
}
