package Chapter_19_Streaming_API.AdditionalExcercises;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        String[] arr = new String[] {"Hello", "5", "World", "22"};
        String str = Stream.of(arr).limit(2)
                .map(String::toUpperCase)
                .reduce("", (acc,el) -> acc+el + " ");
        System.out.println(str);
    }

}
