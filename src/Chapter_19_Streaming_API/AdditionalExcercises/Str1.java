package Chapter_19_Streaming_API.AdditionalExcercises;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Str1 {
    public static void main(String[] args) {

        //1. Integer Stream
        IntStream
                .range(1,10)
                .forEach(System.out::println);
        System.out.println();

        //2. Integer Stream with skip
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(System.out::println);
        System.out.println();

        //3. Integer Stream with sum
        System.out.println(
        IntStream
                .range(1,5)
                .sum());
        System.out.println();

        //4. Stream .of, sorted and findFirst
        Stream.of("Ava", "Adam", "Flynn")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //5. Stream from Array, sort, filter and print
        String[] names = {"Al","Beta","Gamma","Echo","Adam","Sofia","Selena"};
        Arrays.stream(names) //Stream.of(names)
                .filter( x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
