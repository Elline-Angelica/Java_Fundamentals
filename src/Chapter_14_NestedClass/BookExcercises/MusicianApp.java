package Chapter_14_NestedClass.BookExcercises;

public class MusicianApp {
    public static void main(String[] args) {

        Musician beethoven = new Musician();
        Musician.Instrument action = beethoven.new Instrument();

        System.out.println("\nBeethoven ");
        beethoven.play();
        System.out.println("\n-------------------------");
        System.out.println("\nBeethoven ");
        action.makeSound();
        action.makeNoise();
        System.out.println("\n-------------------------");

    }
}
