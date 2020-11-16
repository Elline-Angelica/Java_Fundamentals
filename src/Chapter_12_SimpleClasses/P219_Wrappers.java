package Chapter_12_SimpleClasses;

import java.util.Scanner;

public class P219_Wrappers {
    public static void main(String[] args) {

        System.out.print("Enter a value: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();

        Integer value = Integer.valueOf(input);
        System.out.println(value);

        int intPrimitive = value.intValue();
        System.out.println(intPrimitive);
        System.out.println(Integer.bitCount(value));
        System.out.println(value.byteValue());

    }

}
