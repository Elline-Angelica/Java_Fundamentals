package Chapter_14_NestedClass.BookExcercises.EX3_AnonymousClass;

public class Musician implements Instrument{

        @Override
        public void makeSound() {
            System.out.println("Make sound method");
        }

        public void play() {
            Instrument instrument = new Instrument() {
                @Override
                public void makeSound() {
                    System.out.println("Interface object make sound method");
                }
            };
            instrument.makeSound();
        }
}



