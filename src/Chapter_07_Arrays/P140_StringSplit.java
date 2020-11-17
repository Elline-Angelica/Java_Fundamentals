package Chapter_07_Arrays;

public class P140_StringSplit {

    public static void main(String[] args) {
        String text = "I just want to say hello!";
        String[] str = text.split(" ");
        for (String temp: str) {
            System.out.println(temp);
        }


    }
}
