package Chapter_13_Interfaces.P233_Scales;

public abstract interface Scaleable {

    public static final int QUARTER = 25;
    public static final int HALF = 50;
    public static final int DOUBLE = 200;

    //__________constructors__________

    void scale(int s);

    default void scaleDouble(){
        scale(DOUBLE);
    }

    default void scaleHalf(){
        scale(HALF);
    }

}
