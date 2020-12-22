package Chapter_14_NestedClass.BookExcercises.EX2_LocalNestedClass;

public class Musician {

    public Object getInstrument(){
        int a = 5;
        class Instrument {
            public String toString() {
                return "Make sound" + a;
            }
        }
        return new Instrument();
    }
}
