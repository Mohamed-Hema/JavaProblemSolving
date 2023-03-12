package Edabit.Easy;
import java.util.*;

public class ArrayofMultiples {

    public class Program {
        public static int[] arrayOfMultiples(int num, int length) {
            int[] numArray = new int[length];
            for (int i = 0; i < length; i++) {
                numArray[i] = (num * (i+1));
            }
            return numArray;
        }
    }
}
