/**
 * Created by chandresh.pancholi on 17/07/16.
 */
public class Kadane {
    public static void main(String[] args) {
        int[] input = {-2, -1, -3, -4,-1,-2,-1,-5,-4};
        int len = input.length;

        int curr_max = input[0];
        int max_so_far = input[0];

        for(int i = 1; i < len; i++) {
            curr_max = Math.max(input[i], curr_max + input[i]);
            max_so_far = Math.max(curr_max, max_so_far);
        }
        System.out.println(max_so_far);
    }
}
