/**
 * Created by chandresh.pancholi on 08/03/16.
 */
public class LongestIncreasingSubsequence {
    public static void main(String args[]) {
        int[] sequence = { 10, 22, 9, 33, 21, 50, 41, 60 };

        int [] lis = new int[sequence.length];

        for(int i = 0; i < lis.length; i++) {
            lis[i] = 1;
        }

        for(int i = 1; i < sequence.length; i++ ) {
            for(int j = 0; j < i; j++) {
                if( sequence[i] > sequence[j] && lis[i] < lis[j] + 1 ) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int max = 0;

        for(int i = 0; i < lis.length; i++) {
            if(lis[i] > max) {
                max = lis[i];
            }
        }

        System.out.println(max);
    }


}

