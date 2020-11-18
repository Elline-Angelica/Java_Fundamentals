package Chapter_07_Arrays.Revision_Arrays;

public class ArrayApp extends IntArrayTools{

    public static void main(String[] args) {

        int[] nums = {1,3,6};
        System.out.println(isSorted(nums));

        int[] unSortedArr = {3,2,6};
        for (int num : sort(unSortedArr)){
            System.out.println(num);
        }

        int[] chopArr = {1,4,8,10};
        System.out.println(chopSearch(chopArr,4));

        char[] arr = {'b','c','?'};
        for (char temp : arr) {
            System.out.println(CharArrayTools.filterAlphabet(arr));
        }


    }

}
