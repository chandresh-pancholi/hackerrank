package array.v1;

import java.util.Arrays;

/**
 * Created by chandresh.pancholi on 10/09/16.
 */
public class TripletSum {
    public static void main(String[] args) {
        int[] input = {1, 4, 45, 6, 10, 8};
        int len = input.length;

        int sum = 22;

        Arrays.sort(input);

        for (int i = 0; i < len; i++) {
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                if (input[i] + input[l] + input[r] == sum) {
                    System.out.println(input[i] + " " + input[l] + " " + input[r]);
                    l++;
                    r--;
                } else if (input[i] + input[l] + input[r] > sum){
                    r--;
                } else  {
                    l++;
                }
            }
        }
    }
}
