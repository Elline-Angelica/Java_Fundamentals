package Chapter_14_NestedClass;

public class MusicianApp {
    public static void main(String[] args) {

        Musician test = new Musician();
        Musician.Instrument temp = test.new Instrument();

        test.play();
        System.out.println("-------------------------");
        temp.makeNoise();
        temp.makeSound();

    }
}
