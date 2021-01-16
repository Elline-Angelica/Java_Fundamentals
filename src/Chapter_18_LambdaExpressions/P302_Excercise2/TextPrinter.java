package Chapter_18_LambdaExpressions.P302_Excercise2;

import java.math.BigDecimal;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor processor) {
        for(String w : sentence.split(" ")) {
            System.out.println(processor.process(w));
        }
    }

    public void printNumberValues(NumberParser parser){
        for(String w : sentence.split(" ")) {
            System.out.println(parser.parse(w));
        }
    }

    public void printSum(NumberParser parser){
        BigDecimal total = new BigDecimal(0);
        for (String w : sentence.split(" ")) {
            total = total.add(parser.parse(w));
        }
        System.out.println(total);
    }
}



