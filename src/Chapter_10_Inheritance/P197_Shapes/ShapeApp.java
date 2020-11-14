package Chapter_10_Inheritance.P197_Shapes;

public class ShapeApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(13,51,48,66);
        Square square = new Square(13,48,66);
        Circle triangle = new Circle(5);
        Triangle definitelyACircle = new IsoScelesTriangle(13,51,48,66);

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(triangle);
        System.out.println(definitelyACircle);
    }

}
