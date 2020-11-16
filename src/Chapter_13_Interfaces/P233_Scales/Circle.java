package Chapter_13_Interfaces.P233_Scales;

import java.util.Objects;

public class Circle extends Shape{

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public void scale(int s) {
        this.radius *= ((double) s) /100;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }
}
