package Chapter_18_LambdaExpressions.P306_Excercise3;

public interface TextUtil {
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
