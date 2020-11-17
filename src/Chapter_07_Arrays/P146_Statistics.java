package Chapter_07_Arrays;

public class P146_Statistics{

        public static double getAverage(int[]arr){
            double total = 0;

            for(int i=0; i<arr.length; i++){
                total = total + arr[i];
            }

            double average = total / arr.length;
            return average;
        }

        public static int getMin(int[]numbers){
            int minValue = numbers[0];
            for(int i=1;i<numbers.length;i++){
                if(numbers[i] < minValue){
                    minValue = numbers[i];
                }
            }
            return minValue;
        }

        public static int getMax(int[] numbers){
            int maxValue = numbers[0];
            for(int i=1;i < numbers.length;i++){
                if(numbers[i] > maxValue){
                    maxValue = numbers[i];
                }
            }
            return maxValue;
        }
}
