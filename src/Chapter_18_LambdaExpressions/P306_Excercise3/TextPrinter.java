package Chapter_18_LambdaExpressions.P306_Excercise3;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Predicate;

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

    public void printNumberValues(Function<String, BigDecimal> parser){
        for(String w : sentence.split(" ")) {
            System.out.println(parser.apply(w));
        }
    }

    public void printSum(Function<String, BigDecimal> parser){
        BigDecimal total = new BigDecimal(0);
        for (String w : sentence.split(" ")) {
            total = total.add(parser.apply(w));
        }
        System.out.println(total);
    }

    public void filteredText(Predicate<String> filter){
        for (String w : sentence.split(" ")) {
            if(filter.test(w)){
                System.out.println(w);
            }
        }
    }
}



