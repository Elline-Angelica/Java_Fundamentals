package Chapter10;

public class Square extends Rectangle{

    //___________________variabelen___________________
    private static int count = 0;

    {
        count++;
    }

    //_________________constructors___________________
    public Square(){
        this(1,1,1);
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

    }

