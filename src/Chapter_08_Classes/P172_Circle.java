package Chapter_08_Classes;

public class P172_Circle {

    public static final int ANGLES = 0;
    public static int count = 0;

    {
        count++;
    }

    private static int x;
    private static int y;
    private static int radius;
    private static int grow;

    //_________________________constructors_________________________

    public P172_Circle(){

    }

    public P172_Circle(int radius){
        setRadius(radius);
    }

    public P172_Circle(int radius, int x, int y){
       setRadius(radius);
       setX(x);
       setY(y);
    }

    //______________________getters & setters_______________________


    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public static int getRadius(){
        return radius;
    }

    public static void setRadius(int radius){
        P172_Circle.radius = radius;
    }

    public static double getArea(int radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double getPerimeter(int radius){
        double perimeter = Math.PI * radius * 2;
        return perimeter;
    }

    public static void grow(int d){
        P172_Circle.radius = radius+d;
    }

    public static int getCount(int count){
        return count;
    }


}
