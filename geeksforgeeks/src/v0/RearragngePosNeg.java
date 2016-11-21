package v0;

/**
 * Created by chandresh.pancholi on 01/09/16.
 */
public class RearragngePosNeg {
    public static void main(String[] args) {
        int[] input = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int len = input.length;

        int i = -1;
        for (int j = 0; j < len; j++) {
            if (input[j] < 0) {
                i++;
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
        }

        int pos = i + 1;
        int neg = 0;

        while (pos < len && neg < pos && input[neg] < 0) {
            int temp = input[pos];
            input[pos] = input[neg];
            input[neg] = temp;
            pos++;
            neg += 2;
        }

        for (i = 0; i < len; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}
