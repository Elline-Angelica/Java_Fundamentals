package Chapter_A_5_ProgrammingBasics;

public class P74_Conditionals {

    //Opdracht 11

    public static void main(String[] args)
    {
       int num1 = 93720;
       int num2 = 42773;
       int num3 = 48924;


       int value  = (num1>num2)?num1:num2;
       int value2 = (num2>num3)?num2:num3;
       int value3 = (num3>num1)?num3:num1;
       int value4 = (num2>num1)?num2:num1;
       int value5 = (num1>num3)?num1:num3;

        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);


    }


}
