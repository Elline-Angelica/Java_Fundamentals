package Chapter_A_4_ProgrammingLogic;

import java.util.Scanner;

public class P38_IfElse {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = scanner.nextInt();

        if (age>=18){
            System.out.println("You are an adult");
        } else {
            if (age >= 10){
                System.out.println("You are a teenager");
            } else {
                if (age >= 2){
                    System.out.println("You are a child");
                } else {
                    System.out.println("You are a baby");
                }
            }
        }
scanner.close();

    }

}
//IF ELSE