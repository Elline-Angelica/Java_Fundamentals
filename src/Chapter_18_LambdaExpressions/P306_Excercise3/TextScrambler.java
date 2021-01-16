package Chapter_18_LambdaExpressions.P306_Excercise3;

public class TextScrambler {
    public String scramble(String s){
        return s.replaceAll("a","@")
                .replaceAll("e","€")
                .replaceAll("l","1")
                .replaceAll("o","0");
    }
}
