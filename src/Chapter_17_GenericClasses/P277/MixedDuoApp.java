package Chapter_17_GenericClasses.P277;

public class MixedDuoApp {
    public static void main(String[] args) {
        MixedDuo<String, Integer> value = new MixedDuo<>("Age", 5);
        String s = value.getFirst();
        Integer i = value.getSecond();
        System.out.println(s + ": " + i);
    }
}
