package array.v1;

/**
 * Created by chandresh.pancholi on 10/09/16.
 */
public class SubArraySum {
    public static void main(String[] args) {
        int[] input = {15, 2, 4, 8, 9, 5, 10, 23};
        int len = input.length;
        int start = 0;
        int curr_sum = 0;
        int sum = 23;

        for (int i = 0; i < len; i++) {
            while (curr_sum > sum && start < len) {
                curr_sum -= input[start];
                start++;
            }

            if (curr_sum == sum) {
                System.out.println(start + " " + (i - 1));
            }
            curr_sum += input[i];
        }
    }
}
