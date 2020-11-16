package Chapter_13_Interfaces.P233_Scales;

public class Square extends Rectangle {

    //___________________variables___________________
    private static int count = 0;

    static { count++; }

    //_________________constructors___________________
    public Square(){
        this(10,1,1);
    }

    public Square(int s){
        this(s,1,1);
    }

    public Square(int s, int x, int y){
        super(s,s,x,y);
    }

    public Square(Square square){
        this(square.getSide(), square.getX(), square.getY());
    }


    //___________________getters_______________________
    public int getSide(){
        return getHeight();
    }

    public static int getCount() {
        return count;
    }

    //___________________setters________________________
    public void setSide(int s){
        super.setHeight(s);
        super.setWidth(s);
    }

    @Override
    public void setHeight(int h){
        setSide(h);
    }

    @Override
    public void setWidth(int w){
        setSide(w);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }

    }

