package Chapter_18_LambdaExpressions.P306_Excercise3;

//        import java.math.BigDecimal;
import java.util.function.Predicate;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("This is an example sentence lmao Elline Angelica Medrano");

//        System.out.println("\n========== Print words in reversed order ==========\n"); //statisch methode referentie
//        tp.printProcessedWords(TextUtil::reverse);
//
//        System.out.println("\n========== Print words in scrambled order ==========\n"); //gebonden methode referentie
//        TextScrambler ts = new TextScrambler();
//        tp.printProcessedWords(ts::scramble);
//
//        System.out.println("\n============ Print words in lower caps ============\n"); //ongebonden methode referentie
//        tp.printProcessedWords(String::toLowerCase);
//
//        System.out.println("\n========== Print words in number values ===========\n");
//        TextPrinter tp2 = new TextPrinter("1228198 2938 32737 27073 2370710 42820840");
//        tp2.printNumberValues(BigDecimal::new);
//        //tp2.printNumberValues(s -> new BigDecimal(s));
//        System.out.println("\n======== Print words in number values' sum ========\n");
//        tp2.printSum(BigDecimal::new);

        System.out.println("\n= Print words containing 'e' and 'a' using predicate =\n");
        Predicate<String> p1 = word -> word.contains("e");
        Predicate<String> p2 = word -> word.contains("a");
        tp.filteredText(p1.and(p2));

        //TODO:
        // 1. Print words in caps and reversed using functional interface
        // 2. Use Consumer interface in TextPrinter class

    }
}
