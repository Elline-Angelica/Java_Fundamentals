package Chapter_18_LambdaExpressions.P302_Excercise2;

import java.math.BigDecimal;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("This is an example sentence");

        System.out.println("\n========== Print words in reversed order ==========\n"); //statisch methode referentie
        tp.printProcessedWords(TextUtil::reverse);

        System.out.println("\n========== Print words in scrambled order ==========\n"); //gebonden methode referentie
        TextScrambler ts = new TextScrambler();
        tp.printProcessedWords(ts::scramble);

        System.out.println("\n============ Print words in lower caps ============\n"); //ongebonden methode referentie
        tp.printProcessedWords(String::toLowerCase);

        System.out.println("\n========== Print words in number values ===========\n");
        TextPrinter tp2 = new TextPrinter("1228198 2938 32737 27073 2370710 42820840");
        tp2.printNumberValues(BigDecimal::new);
        //tp2.printNumberValues(s -> new BigDecimal(s));
        System.out.println();
        tp2.printSum(BigDecimal::new);


    }
}
