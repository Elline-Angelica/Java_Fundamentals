package Chapter_16_Javadoc;

/** This class is square in a two dimensional area.
 * This class can be used the following way:
 * <pre>
 *     square sq = new Square (5);
 * </pre>
 * @author Elline Medrano
 * @version 2.0
 * @see graphics.Rectangle
 */

import Chapter_13_Interfaces.P233_Scales.Rectangle;

public class P266 {
    public class Square extends Rectangle {

        //___________________variables___________________


        //_________________constructors___________________
        public Square(){
            this(10,1,1);
        }

        public Square(int s){
            this(s,1,1);
        }

        public Square(int s, int x, int y){
            super(s,s,x,y);
        }

        public Square(Chapter_13_Interfaces.P233_Scales.Square square){
            this(square.getSide(), square.getX(), square.getY());
        }


        //___________________getters_______________________
        public int getSide(){
            return getHeight();
        }


        //___________________setters________________________
        public void setSide(int s){
            super.setHeight(s);
            super.setWidth(s);
        }

        @Override
        public void setHeight(int h){
            setSide(h);
        }

        @Override
        public void setWidth(int w){
            setSide(w);
        }

        @Override
        public String toString() {
            return "Square{} " + super.toString();
        }

    }


}
