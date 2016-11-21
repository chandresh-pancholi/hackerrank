package array.v1;

/**
 * Created by chandresh.pancholi on 10/09/16.
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 3, 6, 6,2};
        int len = input.length;

        for (int i = 0; i < len; i++) {
            if (input[Math.abs(input[i])] > 0) {
                input[Math.abs(input[i])] = -input[Math.abs(input[i])];
            } else {
                System.out.print(Math.abs(input[i]) + " ");
            }
        }
    }
}
