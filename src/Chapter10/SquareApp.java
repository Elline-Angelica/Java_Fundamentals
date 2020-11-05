package Chapter10;

public class SquareApp {
    public static void main(String[] args) {
        Square sq = new Square();

        sq.setSide(3);
        sq.setPosition(5,5);
        System.out.println("square properties:");
        System.out.println("area: " + sq.getArea());
        System.out.println("perimeter: " + sq.getPerimeter());
        System.out.println("side: " +sq.getSide());

        //Polymorphism
        Rectangle rect = new Square();
        rect = new Rectangle();
        System.out.println(rect.getHeight());


    }
}
