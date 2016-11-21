import java.util.Arrays;

/**
 * Created by chandresh.pancholi on 17/07/16.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {1, 1,2, 3};
        int len = input.length;

        int j = 0;
        int i = 1;
        while (i < len) {
            if(input[i] == input[j]) {
                i++;
            } else {
                j++;
                input[j] = input[i];
                i++;
            }
        }
        for(i = 0; i < input.length; i++) {
           System.out.print(input[i] + " ");
        }
        System.out.println();
        int[] output = Arrays.copyOf(input, j+1);

        for(int k = 0; k < output.length; k++) {
            System.out.print(output[k] + " ");
        }
    }
}
