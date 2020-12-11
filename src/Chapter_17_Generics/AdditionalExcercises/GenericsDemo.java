package Chapter_17_Generics.AdditionalExcercises;

public class GenericsDemo {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3};
        Character[] charArr = {'E', 'A', 'M'};

        printMethod(arr);
        printMethod(charArr);

        System.out.println();
        System.out.println(maximum(23,42,1));
        System.out.println(maximum("apples", "pears", "bananas"));
        System.out.println(maximum('A', 'B', 'C'));

    }


    //******************GENERIC METHODS******************

    public static <T> void printMethod(T[] x) {
        for (T temp : x) {
            System.out.print(temp + " ");
        }
    }

    //***************GENERIC RETURN TYPES*****************

    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if(b.compareTo(a) > 0)
            max = b;
        if(c.compareTo(max) > 0)
            max = c;
        return max;
    }
}

    //******************OVERLOADED METHODS******************

    //avoid using too much methods

   /*
        public static void printMethod(Integer[] i) {
            for(Integer temp : i) {
                System.out.print(temp + " ");
            }
        }

        public static void printMethod(Character[] c) {
            for(Character temp : c) {
                System.out.print(temp + " ");
            }
        }
    */


