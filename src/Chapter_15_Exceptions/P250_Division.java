package Chapter_15_Exceptions;

import java.util.Scanner;

public class P250_Division {
    public static void main(String[] args) {


        //Exception Handling

        //*************************Exercise 1*************************

        /*
                System.out.println("Enter the first integer you want to divide:");
                Scanner keyboard = new Scanner(System.in);
                int num = Integer.parseInt(keyboard.next());
                System.out.println("Enter the second integer you want to use as divider:");
                int den = Integer.parseInt(keyboard.next());
                int div = num / den;
                System.out.println("The division is: ");
                System.out.printf("%d/%d=%d", num, den, div);
                keyboard.close();
         */

        //*************************Exercise 2*************************

         /*
            try {
                System.out.println("Enter the first integer you want to divide:");
                Scanner keyboard = new Scanner(System.in);
                int num = Integer.parseInt(keyboard.next());
                System.out.println("Enter the second integer you want to use as divider:");
                int den = Integer.parseInt(keyboard.next());
                int div = num / den;
                System.out.println("The division is: ");
                System.out.printf("%d/%d=%d", num, den, div);
                keyboard.close();
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        */

        //*************************Exercise 3*************************        //throw in second catch
        //*************************Exercise 4*************************        //use superclass & polymorphism
        //*************************Exercise 5*************************        //implement 'finally'

        /*

            try {
                System.out.println("Enter the first integer you want to divide:");
                Scanner keyboard = new Scanner(System.in);
                int num = Integer.parseInt(keyboard.next());
                System.out.println("Enter the second integer you want to use as divider:");
                int den = Integer.parseInt(keyboard.next());
                int div = num / den;
                System.out.println("The division is: ");
                System.out.printf("%d/%d=%d", num, den, div);
                keyboard.close();
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            } catch (ArithmeticException ae) { //Or superclasses like Runtime Exception or Throwable --> Polymorphism
                System.out.println("Division by 0");
            } finally {
                keyboard.close();
                System.out.println("The end");
            }

        */

    }
}
