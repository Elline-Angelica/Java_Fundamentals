package Chapter_14_NestedClass;

public class Musician {

    public class Instrument{

        public void makeSound() {
            System.out.println("*made sounds*");
        }

        public void makeNoise(){
            System.out.println("*made noise*");
        }
    }

    public void play() {
        Instrument inner = new Instrument();
        inner.makeSound();
        inner.makeNoise();
    }


}
