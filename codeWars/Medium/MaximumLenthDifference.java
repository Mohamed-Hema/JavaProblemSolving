package codeWars.Medium;

public class MaximumLenthDifference {
    class MaxDiffLength {

        public static int mxdiflg(String[] a1, String[] a2) {
            int max = -1;
            for(int i = 0; i < a1.length; i++)
                for(int j = 0; j < a2.length; j++)
                    max = Math.max(max,Math.abs(a1[i].length()-a2[j].length()));
            return max;
        }
    }
}
