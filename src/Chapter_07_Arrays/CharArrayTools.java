package Chapter_07_Arrays;

public class CharArrayTools {

    public static char[] filterAlphabet(char[] charachters) {
        // Character.isAlphabetic(charachters[0]);
        char[] lettersOnly;
        String temp = "";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};

        for (char toCheck: charachters) {
            for (char c : alphabet) {  //elk character vergelijke met letter alphabet
                if (c == toCheck) {
                    temp += toCheck;
                }
            }
        }

        lettersOnly = temp.toCharArray();
        return lettersOnly;
    }

    public static char[] sort(char[] chars){
        char temp;
        //originele bubble sort
        for(int i = 0;  i < chars.length-1; i++){ //instead of while
            for (int j = 0; j < chars.length-i-1; j++){ // om letters die al juist staan niet meer na te kijken
                if (chars[j] > chars[j+1]){
                    temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }

        return chars;
    }



}

