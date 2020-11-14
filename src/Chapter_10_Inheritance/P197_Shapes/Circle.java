package Chapter_10_Inheritance.P197_Shapes;

public class Circle extends Shape {

    public final static int ANGLES = 0;
    private static int count;
    private int radius;

    static {
        count++;
    }

    //___________constructors___________
    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    //______________getters______________
    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    public void grow(int d) {
        this.radius *= Math.abs(d);
    }

    public static int getCount() {
        return count;
    }

    //______________setters______________
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
