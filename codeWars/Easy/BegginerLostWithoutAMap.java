package codeWars.Easy;

public class BegginerLostWithoutAMap {
    public static int[] map(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i]*2;
        }
        return inputArray;
    }
}
