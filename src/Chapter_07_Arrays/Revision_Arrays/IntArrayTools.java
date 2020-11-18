package Chapter_07_Arrays.Revision_Arrays;

public class IntArrayTools {


    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static int[] sort(int[] nums) {

        while (!isSorted(nums)){
            for(int i = 0; i < nums.length - 1; i++){
                if (nums[i]>nums[i+1]){
                    int temp;
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }return nums;
    }


    public static boolean chopSearch(int[] nums, int number){

        for(int temp : nums){
            if (temp == number){
                return true;
            }
        }
        return false;
    }


}

