package be.intecbrussel.givenExcercises;

import java.util.Scanner;

public class GivenEXC8 {

    //programma waarin laatste 3 symbolen in caps gezet wordt

   /* public static void main(String[] args) {
        String str = "hello World!";

        String strUpperCase = str.toUpperCase();

        System.out.println("Java String to Upper Case: " + strUpperCase);

        readUserInputAndPrintInUpperCase();
    }

    private static void readUserInputAndPrintInUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write input String and press Enter:");
        String str = sc.nextLine();
        if (str.length() < 3){
        str = str.substring(0, str.length() - 3);
        System.out.println("Input String in Upper Case = " + str.length() - 3, str.length()).toUpperCase());
        sc.close();}
    }

}*/

    static void convertOpposite(StringBuffer str)
    {
        int ln = str.length();

        // Conversion using predefined methods
        for (int i=0; i<ln; i++)
        {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");

        }
    }

    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("GeEkSfOrGeEkS");
        // Calling the Method
        convertOpposite(str);

        System.out.println(str);
    }
}


