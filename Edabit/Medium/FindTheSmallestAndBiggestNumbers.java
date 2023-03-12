package Edabit.Medium;

public class FindTheSmallestAndBiggestNumbers {
    public class Challenge {
        public static double[] minMax(double[] arr) {
            double min = arr[0];
            double max = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                } else if(arr[i] > max) {
                    max = arr[i];
                }
            }
            return new double[]{min, max};
        }
    }

}
