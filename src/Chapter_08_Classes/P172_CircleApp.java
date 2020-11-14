package Chapter_08_Classes;

public class P172_CircleApp extends P172_Circle {
    public static void main(String[] args) {

        P172_Circle c = new P172_Circle();
        P172_Circle c2 = new P172_Circle(1,90,100);

        c.setX(10);
        c.setY(20);

        P172_Circle c3 = new P172_Circle(4);
        //c3.setRadius(8);
        c3.setPosition(90,100);

        System.out.println("The Area is " + c.getArea(3));
        System.out.println("The Area is " + c2.getArea(5));
        System.out.println("The perimeter is " + c.getPerimeter(3));
        System.out.println("The x position is " + c.getX());
        System.out.println("The y position is " + c.getY());
        System.out.println("The x position is " + c2.getX());
        System.out.println("The y position is " + c2.getY());
        System.out.println("The x position is " + c.getX());
        System.out.println("The radius is " + c3.getRadius());
        System.out.println("The x position is " + c3.getX());
        System.out.println("The y position is " + c3.getY());

    }
}
