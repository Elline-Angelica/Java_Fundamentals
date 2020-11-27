package Chapter_15_Exceptions;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = Integer.parseInt(keyboard.next());
        int den = Integer.parseInt(keyboard.next());
        int div = num / den;
        System.out.printf("%d/%d=%d", num, den, div);
        keyboard.close();

    }
}
