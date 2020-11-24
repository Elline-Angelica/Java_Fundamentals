package Chapter_14_NestedClass.AdditionalExcercises;

public class ClassTester {

    /*
    Nested Class: a class defined inside the body of another class
    4 types: Static, Non static, Local & Anonymous
     */

    public static void main(String[] args) {

        //static field
        System.out.println(OuterClass.staticField);
        System.out.println("\n***************************************\n");


        //non-static field(instance-level)
        OuterClass outerClass = new OuterClass();
        //instance field
        System.out.println(outerClass.instanceField);
        System.out.println("\n***************************************\n");

        //play with static field to prove there's only one variable shared among all OuterClass objects
        OuterClass outerClass1 = new OuterClass();
        /*
        outerClass.staticField++;
        System.out.println(outerClass.staticField);
        outerClass1.staticField++;
        System.out.println(outerClass1.staticField);
        OuterClass.staticField++;
        System.out.println(outerClass.staticField);
         */

        System.out.println("\n***************************************\n");

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        System.out.println("\n***************************************\n");

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        System.out.println("\n***************************************\n");

        outerClass.instanceMethod();




    }
}


