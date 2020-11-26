package Chapter_14_NestedClass.AdditionalExcercises;

public class OuterClass {

    static int staticField = 0; //static, class level..., variable shared amongst all instances of OuterClass

    int instanceField; // non-static, instance level, each instance of OuterClass gets its own instanceField

    public OuterClass(){
        instanceField = 1;
        System.out.println("Hello from OuterClass constructor");
    }

    //1. static nested class

    public static class StaticNestedClass{
        //nested classes are members of the enclosing class
        //static nested classes can access static members of the enclosing class
        //static nested classes are NOT ASSOCIATED with an instance of the enclosing class

        public StaticNestedClass() {
            System.out.println("Hello from StaticNestedClass constructor");
            System.out.println(staticField);
        }
    }

    //2. non static innerclass

    public class InnerClass{
        //inner classes ARE ASSOCIATED with an instance of the enclosing class
        //inner classes can access static and non static members of the enclosing class
        //will need objects

        //instance level field
        int instanceField;

        public InnerClass(){
            instanceField = 100;
            System.out.println("Hello for InnerClass constructor");
            System.out.println("staticField: " + staticField);
            System.out.println("instanceField: " + this.instanceField); //(this) -> of innerclass //else OuterClass.this refers ti instanceField of OuterClass
            System.out.println("OuterClass instanceField: " + OuterClass.this.instanceField);
        }
    }

    //3. & 4. local classes
    //need a method

    public void instanceMethod(){

        /* final  */ int localVar = 500; //good practice if final

        //3. local class
        class LocalClass{
            //constructor
            public LocalClass(){
                System.out.println("Hello from LocalClass constructor");
                System.out.println("localVar: " + localVar);
                System.out.println("instanceField: " + instanceField);
            }
        }

        //instantiate a LocalClass object
        LocalClass localClass = new LocalClass();

        //local classes can access the local variables of the enclosing method
        //only if the local variables are final or effectively final

        //4. anonymous class - no name (ex. maybe pretty short, not comprehensive, not using elsewhere
        // we need the name of an interface to implement or a class to extend in order to creat an anonymous
        //example; let's extend object

        Object myAnonymousClassObject = new Object(){
            //override methods

            @Override
            public String toString() {
                return "HELLO";
            }
        };
        System.out.println(myAnonymousClassObject);
    }
}
