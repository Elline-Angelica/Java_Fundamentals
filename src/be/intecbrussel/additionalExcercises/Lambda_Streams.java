package be.intecbrussel.additionalExcercises;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Lambda_Streams {

    public static void main(String[] args) {

        intArray();
        stringArray();

    }

    public static void intArray(){

        int[] arr = new int[] {1,5,10,15,20,25,30,35,40,45,50};

        IntStream.of(arr).map(number -> number * 5)
                .filter(number -> number > 50)
                .forEach(number -> System.out.print(number + " "));

        double[] doubles = IntStream.of(arr).mapToDouble(number -> 1.0 * number/2).toArray();
        DoubleStream.of(doubles).forEach(number -> System.out.print(number + " "));

    }

    public static void stringArray(){
        String[] arr = new String[] {"Me", "5", "Myself", "i"};
    }

}
