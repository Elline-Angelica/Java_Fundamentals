package Chapter_05_ProgrammingBasics;

import java.util.Scanner;

public class P104_KeyboardUtility {

    public static float readIntCM() {
        Scanner sc1 = new Scanner(System.in);
        float input = sc1.nextInt();
        input = input/100;
        return input;
    }

    public static float readIntKG(){
        Scanner sc2 = new Scanner(System.in);
        return sc2.nextInt();
    }
}
