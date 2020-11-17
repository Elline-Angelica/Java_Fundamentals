package Chapter_07_Arrays;


public class P146_StatisticsApp extends P146_Statistics {

    public static void main(String[] args) {
        int [] nums = new int[] {1,2,3,4,5};

        System.out.println("The average is= " + getAverage(nums));
        System.out.println("The minimum value is= " + getMin(nums));
        System.out.println("The maximum value is= " + getMax(nums));
    }

}
