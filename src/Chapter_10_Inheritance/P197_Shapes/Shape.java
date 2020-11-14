package Chapter_10_Inheritance.P197_Shapes;

public abstract class Shape {

    private static int count = 0;
    private int x;
    private int y;

    //___________constructors___________
    public Shape(){
        this(0,0);
    }

    public Shape(int x, int y){
        setPosition(x,y);
    }

    //______________getters______________
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount() {
        return count;
    }

    //______________setters______________
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
