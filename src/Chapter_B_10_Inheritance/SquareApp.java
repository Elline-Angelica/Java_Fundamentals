package Chapter_B_10_Inheritance;

public class SquareApp{
    public static void main(String[] args) {
        Square sq = new Square();
        Square sq2 = new Square(30,52,66);
        Square sq3 = new Square(sq2);
        Rectangle sq4 = new Square(5); //polymorphism
        Rectangle sq5 = new Square(7); //polymorphism

        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle(30,50);


        sq.setSide(3);
        sq.setPosition(5,5); //set.position from rectangle

            System.out.println("The amount of angles are: " + sq3.getAngles());
            System.out.println("The amount of squares are: " + Square.getCount());
            System.out.println("square properties:");
            System.out.println("area: " + sq.getArea());
            System.out.println("perimeter: " + sq.getPerimeter());
            System.out.println("side: " + sq.getSide());
            System.out.println("x position: " + sq.getX());
            System.out.println("y position: " + sq.getY());
            System.out.println(sq4.getArea());
            System.out.println(sq5.getPerimeter());
            System.out.println(rect.getAngles());
            System.out.println(rect2.getArea());
    }
}
