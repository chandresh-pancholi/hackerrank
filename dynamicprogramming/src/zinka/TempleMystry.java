package zinka;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by chandresh.pancholi on 18/05/16.
 */
public class TempleMystry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = 0;

        while (count < total) {
            int arrLength = sc.nextInt();
            int[] inputArray = new int[arrLength];
            for(int i = 0; i < arrLength; i++) {
                inputArray[i] = sc.nextInt();
            }
            if(findDivision(inputArray)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            count++;
        }
    }

    private static boolean findDivision(int[] inputArray) {
        int sum = 0;
        for(int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }

        if(sum % 2 != 0){
            return false;
        }

        return isDivisionPossible( inputArray,inputArray.length, sum/2);


    }

    private static boolean isDivisionPossible(int[] inputArray,int n, int sum) {
        if(sum == 0) {
            return  true;
        }
        if(n == 0 && sum != 0) {
            return false;
        }

        if(inputArray[n-1] > sum) {
            return isDivisionPossible(inputArray, n-1, sum);
        }

        return isDivisionPossible(inputArray,n-1,sum) || isDivisionPossible(inputArray, n-1,sum-inputArray[n-1]);

    }

}
