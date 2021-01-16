package Chapter_18_LambdaExpressions.P297;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {
        for(String w : sentence.split(" ")) {
            if(filter.isValid(w)) {
                System.out.println(w);
            }
        }
    }

    public interface WordFilter {
        boolean isValid(String s);
    }
}
