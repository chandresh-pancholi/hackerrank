/**
 * Created by chandresh.pancholi on 16/07/16.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5,6,7};
        int d = 8;
        int len = input.length;

        for(int i = 0 ; i < d; i++) {
            int temp = input[input.length - 1];

            for(int j = input.length - 1 ; j > 0; j--) {
                input[j] = input[j-1];
            }
            input[0] = temp;

            for (int k = 0; k < input.length; k++) {
                System.out.print(input[k] + " ");
            }
            System.out.println();
        }

    }

}
