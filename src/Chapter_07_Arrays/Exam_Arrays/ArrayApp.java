package Chapter_07_Arrays.Exam_Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] unsortedNumbers = {8,4,2,6};
        String testSentence = "we zullen eens zien of dit werkt?...";
        char[] toSort = {'z', 'a', 'b'};

        for (int num : IntArrayTools.sortingArray(unsortedNumbers)){
            System.out.println(num);
        }

    for (char c : CharArrayTools.filterAlphabet(testSentence.toCharArray())){
        System.out.print(c);

    }

    for (char c : CharArrayTools.sort(toSort)){
        System.out.println(c);
    }


    }

}
