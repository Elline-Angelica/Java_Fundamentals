package Chapter_07_Arrays.Revision_Arrays;

public class CharArrayTools {

    public boolean isAlphanumeric(String str)
    {
        char[] charArray = str.toCharArray();
        for(char c:charArray)
        {
            if (!Character.isLetterOrDigit(c))
                return false;
        }
        return true;
    }

    public static char[] filterAlphabet(char[] chArr) {

        for (char temp : chArr ) {
            if(Character.isLetterOrDigit(temp)){
               char[] filteredArr = new char[chArr.length];
               for(char c : filteredArr){
                   filteredArr[c] = temp;
                   c++;
               } return filteredArr;
            }
        }
        return chArr;
    }

}
