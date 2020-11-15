package Chapter_10_Inheritance.P197_Shapes;

import java.util.Random;

public class DrawingApp {

    public static void main(String[] args) {

        Drawing myDrawing = new Drawing();

        for(int i = 0; i < 200; i++){
            myDrawing.addShape(getRandomShape());
        }

        System.out.println(myDrawing);
    }

    private static Shape getRandomShape(){
        Random rand = new Random();
        int shapeType = rand.nextInt(5);

        switch(shapeType){
            case 0: return new Circle(rand.nextInt(1000));
            case 1: return new IsoScelesTriangle(rand.nextInt(1000),rand.nextInt(1000), rand.nextInt(1000),rand.nextInt(1000));
            case 2: return new Rectangle(rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(1000));
            case 3: return new Square(rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(1000));
            case 4: return new Triangle(rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(1000));

        }
        return null;
    }

}
