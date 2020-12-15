package Chapter_20_Collections.P328;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Collection<String> stringCollection = new ArrayList<>();

        while (true) {
            String word = kb.next();
            stringCollection.add(word);
            if(word.endsWith(".")) {
                break;
            }
        }

        stringCollection.forEach(e-> System.out.println(e + " "));
        System.out.println();

      
    }
}
