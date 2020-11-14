package Chapter_10_Inheritance.P197_Shapes;

public class Triangle extends Shape{

    public final static int ANGLES = 3;
    private static int count = 0;
    private int height;
    private int width;
    private int perpendicular;

    static { count++; }

    //___________constructors___________
    public Triangle(){

    }

    public Triangle(int w, int h, int p){
        this.width = w;
        this.height = h;
        this.perpendicular = p;
    }

    public Triangle(int w, int h, int p, int x, int y){
        super(x,y);
        setWidth(w);
        setHeight(h);
        setPerpendicular(p);

    }

    public Triangle(Triangle triangle){
        this(triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    //______________getters______________
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public double getArea(){
        return 0.5*(this.width*this.height);
    }

    public double getPerimeter(){
        double hypotenuse1 = Math.hypot(this.height, this.perpendicular);
        double hypotenuse2 = Math.hypot(this.height, (this.width - this.perpendicular));
        return this.width + hypotenuse1 + hypotenuse2;
    }

    public static int getCount() {
        return count;
    }

    //______________setters______________
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                '}';
    }
}
