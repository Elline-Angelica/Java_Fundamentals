package Chapter_13_Interfaces.P233_Scales;

import java.util.Objects;

public class Rectangle extends Shape {

     private int height;
     private int width;

     public static final int ANGLES = 4;
     private static int count;

    static {
        count++;
    }

    //______________________constructors______________________
    public Rectangle(){
//       this(0,0,0,0); //calls constructor with most parameters (4)
        this(1,1);
    }

    public Rectangle(int width, int height){
        this(width,height,1,1);
    }

    public Rectangle(int width, int height, int x, int y){
        setHeight(height);
        setWidth(width);
        setPosition(x,y);
      //  count++;
    }

    public Rectangle(Rectangle rect){
        this(rect.getHeight(),rect.getWidth(),rect.getX(),rect.getY());
    }


    //______________________setters______________________
    public void setHeight(int height){
        this.height = height>0? height: -height;
    }

    public void setWidth(int width){
        this.width = width>0? width : -width;
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


    //______________________getters______________________
    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return height*2+width*2;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public static int getCount() {
        return count;
    }

    public int getAngles() {
        return ANGLES;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", xPos= " + getX() +
                ", yPos= " + getY() +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height &&
                width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }

    @Override
    public void scale(int s) {
        this.height *= ((double) s) /100;
        this.width *= ((double) s) /100;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }

}
