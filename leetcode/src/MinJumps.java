/**
 * Created by chandresh.pancholi on 14/07/16.
 */
public class MinJumps {
    public static void main(String[] args) {
        int[] input = {2, 3, 0, 7};
        int[] jumps = new int[input.length];

        for(int i = 0; i < input.length; i++) {
            jumps[i] = Integer.MAX_VALUE;
        }

        jumps[0] = 0;
        for(int i = 1; i < input.length; i++ ) {
            for(int j = 0; j <i; j++) {
                if(i <= j + input[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                }
            }
        }
        System.out.println(jumps[input.length - 1]);

    }
}
