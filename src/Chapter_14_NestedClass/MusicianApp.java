package Chapter_14_NestedClass;

public class MusicianApp {
    public static void main(String[] args) {

        Musician beethoven = new Musician();
        Musician.Instrument temp = beethoven.new Instrument();

        System.out.println("\nBeethoven ");
        beethoven.play();
        System.out.println("\n-------------------------");
        System.out.println("\nBeethoven ");
        temp.makeSound();
        temp.makeNoise();
        System.out.println("\n-------------------------");

    }
}
