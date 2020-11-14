package Chapter_10_Inheritance.P197_Shapes;

public class RectangleApp {
    public static void main(String[] args){
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle negativeRect = new Rectangle();
        Rectangle constructor2Rect = new Rectangle(5,6);
        Rectangle const4Rect = new Rectangle(4,8,2,1);
        Rectangle exist = new Rectangle(const4Rect);

//        rect.height = 10;
//        rect.width =15;
//        rect.x = 10;
//        rect.y = 3;
        rect.setHeight(10);
        rect.setWidth(15);
        rect.setX(10);
        rect.setY(3);
        rect.grow(5);


//        rect2.height = 1;
//        rect2.width =5;
//        rect2.x = 1;
//        rect2.y = 30;
        negativeRect.setHeight(-3);
        negativeRect.setWidth(-5);


//        System.out.println("The height of rect is: " + rect.height);
//        System.out.println("The width of rect is: " + rect.width);
//        System.out.println("The x position of rect is: " + rect.x);
//        System.out.println("The y position of rect is: " + rect.y);
        System.out.println("The height of rect is: " +rect.getHeight());
        System.out.println("The width of rect is: " + rect.getWidth());
        System.out.println("The area of rect is: " + rect.getArea());
        System.out.println("The perimeter of rect is: " +rect.getPerimeter());
        System.out.println("The x position of rect is: " + rect.getX());
        System.out.println("The y position of rect is: " + rect.getY());
        System.out.println("The amount of rectangles are: " + rect.getCount());


//        System.out.println("The height of rect2 is: " + rect2.height);
//        System.out.println("The width of rect2 is: " + rect2.width);
//        System.out.println("The x position of rect2 is: " + rect2.x);
//        System.out.println("The y position of rect2 is: " + rect2.y);
        System.out.println("Height neg rectangle: " + negativeRect.getHeight());
        System.out.println("Width neg rec: " + negativeRect.getWidth());
        System.out.println("Height constructor2Rect: " + constructor2Rect.getHeight());
        System.out.println("Width neg constructor2Rect: " + constructor2Rect.getWidth());
        System.out.println("The height of const4Rect is: " +const4Rect.getHeight());
        System.out.println("The width of const4Rect is: " + const4Rect.getWidth());
        System.out.println("The x position of const4Rect is: " + const4Rect.getX());
        System.out.println("The y position of const4Rect is: " + const4Rect.getY());
        System.out.println("The height of exist is: " +exist.getHeight());
    }
}
