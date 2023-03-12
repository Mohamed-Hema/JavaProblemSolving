package LeetCode.Easy;

public class RichestCustomerWealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int result = 0;

            for(int[] customer : accounts){
                int sum = 0;
                for(int account : customer) {
                    sum+=account;
                }

                result = Math.max(result, sum);
            }


            return result;
        }
    }
}

//test - upload
