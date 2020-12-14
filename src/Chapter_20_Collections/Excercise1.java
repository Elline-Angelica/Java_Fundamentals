package Chapter_20_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Excercise1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Collection<Integer> intList = new ArrayList<>();

        while (true) {
            int number = kb.nextInt();
            if(number == -1){
                break;
            } else {
                intList.add(number);
            }
        }

        intList.stream().forEach(System.out::println);

        int sum;

        sum = intList.stream()
                .mapToInt(e->e)
                .sum();

        System.out.println("The sum is: " + sum);

        OptionalDouble avg = intList.stream()
                .mapToDouble(e->e)
                .average();

        if(avg.isPresent()) {
            System.out.println("The average is: " + avg);
        }





    }
}
