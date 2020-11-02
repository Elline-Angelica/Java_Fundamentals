package exercises;

import java.util.Scanner;

public class GivenEXC7 {

    //programma waarin spaties in string geteld wordt

    private static GivenEXC7 SpaceCount;

    static int i,c=0,res;

    static int spacecount(String s)
        {
            for(i=0,c=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch==' ')
                    c++;
            }
            return c;
        }

        public static void main (String args[])
        {
            System.out.println("Give a sentence");
            Scanner kb = new Scanner(System.in);
            String input = kb.nextLine();
            res=SpaceCount.spacecount(input);
            //string is always passed in double quotes

            System.out.println("The number of white spaces  in the String are :  "+res);
        }
    }
    

