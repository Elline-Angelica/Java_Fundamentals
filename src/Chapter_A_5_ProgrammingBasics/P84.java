package Chapter_A_5_ProgrammingBasics;

import java.util.Scanner;

public class P84 {

    //Opdracht 14

    public static void main(String[] args)
    {
        System.out.println("Please enter your age");
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();

        if(age >= 18){
            System.out.println("You're an adult");
        }else {
            if (age >= 10) {
                System.out.println("You're a teenager");
            } else {
                if (age >= 2) {
                    System.out.println("You're a child");
                } else {
                    System.out.println("baby");
                }
            }

        }
    }

}
