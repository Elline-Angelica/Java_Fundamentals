package Chapter_18_LambdaExpressions.P297;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("\n============= Words containing 'e' =============\n");
        tp.printFilteredWords(s -> s.contains("e"));
        System.out.println("\n======= Words with length bigger than 4 =======\n");
        tp.printFilteredWords(s -> s.length() > 4);
        System.out.println("\n=========== Words starting with 'e' ===========\n");
        tp.printFilteredWords(s -> s.startsWith("a"));
    }
}
