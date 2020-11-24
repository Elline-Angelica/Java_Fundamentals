package Chapter_14_NestedClass.BookExcercises;

public class Musician {

        public class Instrument {

            public void makeSound() {
                System.out.println("*made Moonlight Sonata*");
            }

            public void makeNoise() {
                System.out.println("*made deaf noises*");
            }
        }

        public void play() {
            Instrument inner = new Instrument();
            inner.makeSound();
            inner.makeNoise();
        }

}
