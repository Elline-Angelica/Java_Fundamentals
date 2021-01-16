package Chapter_18_LambdaExpressions.P302_Excercise2;

public interface TextUtil {
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
