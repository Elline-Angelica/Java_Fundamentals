package Chapter_19_Streaming_API.AdditionalExcercises;

import java.awt.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
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

        //6. Average of squares of an int array
        Arrays.stream(new int[]{2,3,4,6,7})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        //7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al","Beta","Gamma","Echo","Adam","Sofia","Selena");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        //13. Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0,(Double a, Double b) -> a + b);
        System.out.println("Total: " + total);

        //14. Reduction - summary statistics
        IntSummaryStatistics summary = IntStream.of(7,2,19,3,49,34)
                .summaryStatistics();
        System.out.println(summary);

    }
}
