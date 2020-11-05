package Chapter10;

public class Rectangle {

     private int height;
     private int width;
     private int x;
     private int y;

    //constructors (ex7p163)
    public Rectangle(){
//       this(0,0,0,0); // Ex8p165
    }

    public Rectangle(int width, int height){
        setHeight(height);
        setWidth(width);
    }

    public Rectangle(int width, int height, int x, int y){
        setHeight(height);
        setWidth(width);
        setX(x);
        setY(y);
    }

    public Rectangle(Rectangle rect){
        setHeight(rect.height);
        setWidth(rect.width);
        setX(rect.x);
        setY(rect.y);

    }



    //setters
    public void setHeight(int height){
        this.height = height>0? height: -height;
    }

    public void setWidth(int width){
        this.width = width>0? width : -width;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void grow(int d){

        if(d<0){
            if (this.height - Math.abs(d) > 0 && this.width - Math.abs(d) >0){
                this.height += d;
                this.width +=  d;
            }
        } else {
            this.height += d;
            this.width +=  d;
        }
    }

    //getters
    public int getArea(){
        return height*width;
    }

    public int getPerimeter(){
        return height*2+width*2;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }



}
