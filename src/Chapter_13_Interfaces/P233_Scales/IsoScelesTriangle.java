package Chapter_13_Interfaces.P233_Scales;

public class IsoScelesTriangle extends Triangle{

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
    public void setWidth(int width) {
        super.setWidth(width);
        super.setPerpendicular(width/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular * 2);
    }

    @Override
    public String toString() {
        return "IsoScelesTriangle{} " + super.toString();
    }
}
