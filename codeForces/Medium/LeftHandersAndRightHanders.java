package codeForces.Medium;

import java.util.Scanner;

public class LeftHandersAndRightHanders {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int last = scanner.nextInt();
        if(first > second){
            int result = first - second;
            if(result <= last){
                second += result;
                last -= result;
                second += last/2;
                first+=last/2;
            } else {
                second += last;
            }
        } else if(second > first){

            int result = second - first;
            if(result <= last){
                first += result;
                last -= result;
                second += last /2;
                first += last/2;
            }
        }
    }
}
