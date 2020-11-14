package Chapter_06_OOP;

public class P128_StringBuilder {

    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World!");
    StringBuilder sb2 = new StringBuilder("Elline Angelica Medrano");
    sb2.reverse();
    String name = "Sofia";
    String s1 = String.format("My dog's name is %s", name);
    String s2 = String.format("She is %d years old", 10);

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(s1);
        System.out.println(s2);

    }
}