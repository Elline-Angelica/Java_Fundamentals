package Chapter_18_LambdaExpressions.P297_Excercise1;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("\n============= Words containing 'e' =============\n");
        tp.printFilteredWords(s -> s.contains("e"));
        System.out.println("\n======= Words with length bigger than 4 =======\n");
        tp.printFilteredWords(s -> s.length() > 4);
        System.out.println("\n=========== Words starting with 'e' ===========\n");
        tp.printFilteredWords(s -> s.startsWith("a"));
        System.out.println("\n=== Words starting with 'e' on second place ===\n");
        tp.printFilteredWords(s -> s.startsWith("e",1));
        System.out.println("\n======= Words containing 'e' two times ========\n");
        tp.printFilteredWords(s -> {
            int count = 0;
            for(char ch : s.toCharArray()) {
                if (ch == 'e') {
                    count++;
                }
            }
            return count == 2;
        });
    }
}
