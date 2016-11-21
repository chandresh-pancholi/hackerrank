/**
 * Created by chandresh.pancholi on 08/03/16.
 */
public class Kadane {
    public static void main(String args[]) {
        int[] input = {-2, -3, -4, -1, -2, -1, -5, -3};

        int sum = 0;
        int max_so_far = 0;

        for(int i = 0; i<input.length; i++) {
            sum = sum + input[i];

            if(sum < 0) {
                sum = 0;
            }
            else {
                if(max_so_far < sum) {
                    max_so_far = sum;
                }
            }
        }

        System.out.println(max_so_far);

    }
}
