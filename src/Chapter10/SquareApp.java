package Chapter10;

public class SquareApp {
    public static void main(String[] args) {
        Square sq = new Square();
        Square sq2 = new Square();
        Rectangle sq3 = new Square();
        Rectangle rect = new Square(); //polymorphism

        System.out.println("The amount of squares are: " + Square.getCount());


        sq.setSide(3);
        sq.setPosition(5,5);
        //sout xpos en ypos
        System.out.println("square properties:");
        System.out.println("area: " + sq.getArea());
        System.out.println("perimeter: " + sq.getPerimeter());
        System.out.println("side: " +sq.getSide());


    }
}
