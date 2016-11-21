package array;

/**
 * Created by user on 08/04/16.
 */
public class MaxMin {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rearrangeArray(input);
    }

    private static void rearrangeArray(int[] input) {
        for(int i = 0; i < input.length; i++) {
            int temp = input[i];

            while (temp > 0) {
                int j = (i < input.length/2) ? 2*i+1: 2*(input.length - i - 1);

                if(i == j) {
                    input[i] = -temp;
                    break;
                }

                int flag;
                flag = temp;
                temp = input[j];
                input[j] = flag;

                input[j] = -input[j];
                i = j;
            }

        }
        for (int i=0; i<input.length; i++) {
            input[i] = -input[i];
            System.out.print(input[i] + " ");
        }
    }
}
