package Chapter_A_5_ProgrammingBasics;
import java.io.*;
public class P88_Scrabble {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a lowercase character to acquire it's value");
        char c = (char) System.in.read();
        int points = 0;

        switch(c){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'l' :
            case 'n' :
            case 'o' :
            case 'r' :
            case 's' :
            case 't' :
            case 'u' :
                points = 1;break;
            case 'b' :
            case 'c' :
            case 'm' :
            case 'p' :
                points = 3;break;
            case 'd' :
            case 'g' :
                points = 2;break;
            case 'f' :
            case 'h' :
            case 'v' :
            case 'w' :
            case 'y' :
                points = 4;break;
            case 'j' :
            case 'x' :
                points = 8;break;
            case 'k' : points = 5;break;
            case 'q' :
            case 'z' :
                points = 10;break;
        }
        System.out.println(c + "'s value is: "+ points);
    }
}
