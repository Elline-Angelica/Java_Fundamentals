package Chapter_07_Arrays.P138_ArrayExcercises;

public class Multiples7 {

    public static void main(String[] args) {

        //fill array with multiples of 7
        int[] multiples = new int[20];
        for(int i = 0; i<= multiples.length - 1; i++){
            multiples [i] = i*7;
        }

        //print all elements of array sorted
        for (int temp:multiples) {
        //    System.out.println(temp);
        }

        //print all elements from greatest to least (backwards)
        for (int i = 19; i>=0; i--){
            multiples[i] = i*7;
            System.out.println(multiples[i]);
        }





    }
}