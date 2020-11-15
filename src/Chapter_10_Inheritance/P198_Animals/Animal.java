package Chapter_10_Inheritance.P198_Animals;

public abstract class Animal {

    private String name;

    //___________constructors___________
    public Animal(){}

    public Animal(String name){
        this.name = name;
    }

    //______________getters______________
    public String getName() {
        return name;
    }

    //______________setters______________
    public void setName(String name) {
        this.name = name;
    }

    //______________methods______________
    public abstract String move();

    public abstract String makeNoise();
}
