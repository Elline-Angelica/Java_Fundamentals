package Chapter_10_Inheritance.P197_Shapes;

public class SquareApp{
    public static void main(String[] args) {
        Rectangle triangle = new Rectangle();
        Rectangle fourangle = new Rectangle(30, 50);
        Square fivangle = new Square(30,52,66);
        Square sixangle = new Square(fivangle);

        triangle.setPosition(30, 50);
//        triangle.setSide(-20);
        triangle.setHeight(77);
        triangle.setWidth(88);

//        printSquare(triangle);
//        printSquare(fourangle);
//        printSquare(fivangle);
//        printSquare(sixangle);

        System.out.println(Rectangle.getCount());
        System.out.println(Square.getCount());

    }

    public static void printSquare(Square triangle) {
        System.out.println("Side: " + triangle.getSide());
        System.out.println("X: " + triangle.getX());
        System.out.println("Y: " + triangle.getY());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println();
    }
}
