package codeForces.Medium;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum =0;
        for(int i = 0; i < num; i++) {
            sum = 0;
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            for (int j = min + 1; j < max; j++) {
                if(j % 2 != 0){
                   sum+=j;
                }
            }
            System.out.println(sum);
        }
    }
}
