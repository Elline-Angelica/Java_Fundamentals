package Chapter_05_ProgrammingBasics;

import java.util.Scanner;

public class P88 {

    //Opdracht 15 - Maanden

    public static void main(String[] args) {

        System.out.println("Enter a month 1-12");
        Scanner kb = new Scanner(System.in);

        int month = kb.nextInt();
        int days = 0;

        switch (month) {
            default:
                days = 0;
                break;
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;

        }

        if (month <= 12) {
            System.out.println(days);
        } else {
            System.out.println("Please enter a number between 1 and 12 you idiot & refresh the page");
        }
    }
}

