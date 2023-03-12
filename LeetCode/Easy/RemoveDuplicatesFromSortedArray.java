class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0, i = 1;
        for(i = 1; i < nums.length; i++){
            if(nums[i] != nums[j]){
            ++j;
            nums[j] = nums[i];
            }
        }
    return j+1;
    }
}
