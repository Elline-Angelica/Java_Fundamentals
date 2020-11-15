package Chapter_10_Inheritance.Equals_HashMap;

public class P200_Equals {

    //short example to demonstrate difference between == and .equals

    public static void main(String[] args) {

        System.out.println("*************CASE 1*************");
        String s1 = "Love";
        String s2 = "Love";

        if(s1 == s2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(s1.equals(s2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("*************CASE 2*************");
        String Obj1 = new String("Pink");
        String Obj2 = new String("Pink");

        if(Obj1 == Obj2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(Obj1.equals(Obj2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
