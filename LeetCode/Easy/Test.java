package LeetCode.Easy;

public class Test {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
        if(nums.length == 0) System.out.println(nums);

        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                sumEven+=i;
            } else {
                sumOdd+=i;
            }
        }
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int midpoint = left + (right - left) / 2;

        }
    }
}
