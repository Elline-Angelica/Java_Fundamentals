package Chapter5;

import java.util.Scanner;

public class P78 {

    //Opdracht 12

    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 10");

        int a= 1;
        int b= 2;
        int c= kb.nextInt();


        int result = ++a * b-- + b > c? --a : ++b;
        System.out.println("the anwser is " + result);

        kb.close();

    }
}

//Priority App