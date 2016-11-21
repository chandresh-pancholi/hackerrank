package array.v1;

/**
 * Created by chandresh.pancholi on 09/09/16.
 */
public class Segregate0And1 {
    public static void main(String[] args) {
        int[] input = {0, 1, 0, 1, 1, 1};
        int len = input.length;

        int left = 0;
        int right = len-1;

        while (left < right) {
            while (input[left] == 0 && left < right) {
                left++;
            }

            while (input[right] == 1 && left < right) {
                right--;
            }

            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
