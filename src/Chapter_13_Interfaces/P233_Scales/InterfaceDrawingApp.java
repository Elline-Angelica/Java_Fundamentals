package Chapter_13_Interfaces.P233_Scales;

public class InterfaceDrawingApp {
    public static void main(String[] args) {
        Drawing myBeauDessin = new Drawing();
        DrawingContext drawingContext = new TextDrawingContext();

        IsoScelesTriangle iso = new IsoScelesTriangle();
        Rectangle rect = new Rectangle();
        Shape spongebob = new Square();

        myBeauDessin.add(iso);
        myBeauDessin.add(rect);
        myBeauDessin.add(spongebob);

        myBeauDessin.draw(drawingContext); //.draw refers to for each in drawing as well as in drawing context

        System.out.println("--------------------------------------------------------");

        myBeauDessin.scaleDouble();

        myBeauDessin.draw(drawingContext);
    }
}

