package Chapter_19_Streaming_API.AdditionalExcercises;

import java.util.stream.IntStream;

public class Str1 {
    public static void main(String[] args) {

        //1. Integer Stream
        IntStream
                .range(1,10)
                .forEach(System.out::print);
        System.out.println();

        //2. Integer Stream with skip
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(System.out::print);
        System.out.println();

        //3. Integer Stream with sum
        System.out.println(
        IntStream
                .range(1,5)
                .sum());
        System.out.println();

        //4. Stream
    }
}
