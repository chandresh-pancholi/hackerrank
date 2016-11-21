package array.v1;

/**
 * Created by chandresh.pancholi on 09/09/16.
 */

/**
 * Maximum difference between two elements such that larger element appears after the smaller number
 */
public class MaximumDiff {
    public static void main(String[] args) {
        int[] input = {1, 2, 6, 80, 100};
        int len = input.length;

        int max_diff = input[1] - input[0];
        int min_element = input[0];

        for (int i = 1; i < len; i++) {
            if (input[i] - min_element > max_diff) {
                max_diff = input[i] - min_element;
            }
            if (input[i] < min_element) {
                min_element = input[i];
            }
        }

        System.out.println(max_diff);
    }
}
