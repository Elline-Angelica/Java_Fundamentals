package Chapter10;

public class Square extends Rectangle{

    //getters
    public int getSide(){
        return getHeight();
    }

    //setters
    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public void setHeight(int height){
        setSide(height);
    }

    public void setWidth(int width){
        setSide(width);
    }
}
