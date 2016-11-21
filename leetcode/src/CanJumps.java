/**
 * Created by chandresh.pancholi on 17/07/16.
 */
public class CanJumps {
    public static void main(String[] args) {
        int[] input = {2,3,1,1,4};
        int len = input.length;

        int max = input[0];

        for(int i = 0; i < len; i++) {
            if(max < i && input[i] == 0) {
                System.out.println(false);
            }

            if(i + input[i] > max) {
                max = i + input[i];
            }

            if (max >= len - 1) {
                System.out.println(true);
            }
        }
    }
}
