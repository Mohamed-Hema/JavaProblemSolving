package Edabit.Medium;

public class AlgebraSequenceBoxes {
    public class Challenge {
        public static int boxSeq(int step) {
            int boxes = 0;
            for (int i = 1; i <= step; i++) {
                if (i % 2 == 1) {
                    boxes += 3;
                } else {
                    boxes -= 1;
                }
            }
            return boxes;
        }
    }   }
