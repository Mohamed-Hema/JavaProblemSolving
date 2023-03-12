package LeetCode.Easy;

public class FindTheIndexofTheFirstOccurenceinAString {
    class Solution {
        public int strStr(String haystack, String needle) {
            char[] hay = haystack.toCharArray();
            char[] need = needle.toCharArray();
            for(int i = 0; i <= hay.length - need.length; i++){
                int j;
                for(j = 0; j < need.length; j++){
                    if(hay[i+j] != need[j]){
                        break;
                    }
                }
                if(j == need.length){
                    return i;
                }
            }
            return -1;
        }
    }
}
