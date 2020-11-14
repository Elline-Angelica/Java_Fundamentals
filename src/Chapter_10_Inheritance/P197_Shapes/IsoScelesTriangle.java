package Chapter_10_Inheritance.P197_Shapes;

public class IsoScelesTriangle extends Triangle {

    private static int count;
    static { count++; }


    //___________constructors___________
    public IsoScelesTriangle(){

    }

    public IsoScelesTriangle(int w, int h){
        super(w,h,w/2);
    }

    public IsoScelesTriangle(int w, int h, int x, int y){
        super(w,h,w/2, x,y);
    }

    public IsoScelesTriangle(IsoScelesTriangle iso){
        super(iso);
    }

    public static int getCount() {
        return count;
    }

    //______________setters______________@
    @Override
    public void setWidth(int w) {
        super.setWidth(w);
        super.setPerpendicular(w/2);
    }

    @Override
    public void setPerpendicular(int p) {
        super.setPerpendicular(p);
        super.setWidth(p*2);
    }

    @Override
    public String toString() {
        return "IsoScelesTriangle{ " +
                "height= " + getHeight() +
                ", width= "+ getWidth() +
                ", perpendicular= " + getPerpendicular() +
                ", xPos= " + getX() +
                ", yPos= " + getY() + "}";
    }
}
