package array.v1;

/**
 * Created by chandresh.pancholi on 10/09/16.
 */
public class BitonicArray {
    public static void main(String[] args) {
        int[] input = {12, 4, 78, 90, 45, 23};
        int len = input.length;

        int[] inc = new int[len];
        int[] dec = new int[len];

        inc[0] = 1;
        for (int i = 1; i < len; i++) {
            if (input[i] > input[i-1]) {
                inc[i] = inc[i-1] + 1;
            } else {
                inc[i] = 1;
            }
        }

        dec[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            if (input[i] > input[i+1]) {
                dec[i] = dec[i+1] + 1;
            } else {
                dec[i] = 1;
            }
        }

        int max = 0;

        for (int i = 0; i < len; i++) {
            if (inc[i] + dec[i] - 1 > max ) {
                max = inc[i] + dec[i] - 1;
            }
        }
        System.out.println(max);
    }
}
