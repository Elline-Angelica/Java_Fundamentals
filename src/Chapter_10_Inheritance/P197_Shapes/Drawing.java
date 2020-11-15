package Chapter_10_Inheritance.P197_Shapes;

import java.util.Arrays;

public class Drawing {

    private Shape[] shapeArray;
    private int size; //array length

    //___________constructors___________
    public Drawing(){
        shapeArray = new Shape[100];
    }

    public void addShape(Shape s){

        int index = firstAvailArraySlot();
        boolean isNotInDrawing = !containsShape(s);
        boolean indexIsMinusOne = index == -1;

        if(isNotInDrawing){
            if(indexIsMinusOne){
                shapeArray = Arrays.copyOf(shapeArray, shapeArray.length + 1);
                index = shapeArray.length - 1;
            }

            shapeArray[index] = s;
            size++;
        }
    }

    public void removeShape(Shape s){

        int index = indexOfShape(s);
        if(index != -1) {
            shapeArray[index] = null;
            size--;
        }
    }

    public void clear(){
        Arrays.fill(shapeArray,null);
    }

    //______________getters______________
    public int getSize() {
        return size;
    }

    //______________methods______________
    private int indexOfShape(Shape s) {
        for (int index = 0; index < shapeArray.length; index++) {
            if (shapeArray[index] != null && shapeArray[index].equals(s)) {
                return index;
            }
        }
        return -1; //why minus one?
    }

    private boolean containsShape(Shape s) {
        return indexOfShape(s) != -1;
    }

    private int firstAvailArraySlot() {
        for (int index = 0; index < shapeArray.length; index++) {
            if (shapeArray[index] == null) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("This is my drawing: \n");
        for(Shape s : shapeArray) {
            toString.append(s.toString()).append("\n");
        }
        toString.append("Size is: ").append(size);
        return toString.toString();
    }
}
