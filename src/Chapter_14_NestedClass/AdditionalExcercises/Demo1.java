package Chapter_14_NestedClass.AdditionalExcercises;

public class Demo1 {
    public Object getInner(){
        final int a = 5;
        class Inner {
            public String toString() {
                //a++;
                return "Inner " + a;
            }
        }
        return new Inner();
    }
}
