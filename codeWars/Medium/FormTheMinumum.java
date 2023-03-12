package codeWars.Medium;
import java.util.Arrays;

public class FormTheMinumum {

    public class Minimum{

        public static int minValue(int[] values) {
            return Arrays.stream(values)
                    .distinct()
                    .sorted()
                    .reduce(0, (a, b) -> 10 * a + b);
        }
    }
}
