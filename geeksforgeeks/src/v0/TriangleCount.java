package v0;

import java.util.Arrays;

/**
 * Created by chandresh.pancholi on 01/09/16.
 */
public class TriangleCount {
    public static void main(String[] args) {
        int[] input = {10, 21, 22, 100, 101, 200, 300};
        int len = input.length;

        Arrays.sort(input);

        int count = 0;

        for (int i = 0; i < len - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < len; j++) {

                while (k < len && input[i] + input[j] > input[k] ) {
                    k++;
                }

                count += k - j - 1;
            }
        }

        System.out.println(count);
    }
}
