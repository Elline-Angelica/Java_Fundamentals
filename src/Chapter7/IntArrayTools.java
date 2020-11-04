package Chapter7;

public class IntArrayTools {

    public static boolean isSorted(int[] numbers){
        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i]>numbers[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int[] sortingArray(int[] numbers){
        int temp = 0;

        while (!isSorted(numbers)){
        for(int i = 0; i < numbers.length - 1; i++){ //bubble sort
            if (numbers[i]>numbers[i+1]){
                temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        }return numbers;
    }
}
