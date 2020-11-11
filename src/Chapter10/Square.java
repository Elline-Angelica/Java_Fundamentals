package Chapter10;

public class Square extends Rectangle{

    //___________________variabelen___________________
    private static int count = 0;

    //init blok
    {
        count = 0;
    }

    //_________________constructors___________________
    public Square(){
        super();
    }

    public Square(int s){

    }

    public Square(int s, int x, int y){

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

    public void setHeight(int h){
        setSide(h);
    }

    public void setWidth(int w){
        setSide(w);
    }
}
