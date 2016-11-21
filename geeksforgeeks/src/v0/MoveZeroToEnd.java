package v0;

/**
 * Created by chandresh.pancholi on 01/09/16.
 */
public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] input = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int len = input.length;

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (input[i] != 0) {
                input[count++] = input[i];
            }
        }
        while (count <len) {
            input[count++] = 0;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
