package codeWars.Easy;

public class LarioAndMuigiPipeProblem {
    public class Kata {
        public static int[] pipeFix(int[] numbers) {
            int[] fix=new int[numbers[numbers.length-1]-numbers[0]+1];
            int n=numbers[0];
            for (int i=0;i<fix.length;i++) {
                fix[i]=n;
                n+=1;
            }
            return fix;
        }
    }
}
