package greedy.binpacking;

/**
 * Created by user on 05/04/16.
 */
public class BinPacking {
    public static void main(String[] args) {
        int[] weight = {2, 5, 4, 7, 1, 3, 8};
        int c = 10;
        int n = weight.length;

        System.out.println(bestFit(weight, c, n));
    }

    private static int bestFit(int[] weight, int c, int n) {
        int res = 0;

        int[] bin_rem = new int[n];

        for(int i = 0; i < n; i++) {
            int min = c + 1;
            int bi = 0;

            for(int j = 0; j < res; j++) {
                if(bin_rem[j] >= weight[i] && bin_rem[j] - weight[i] < min) {
                    bi = j;
                    min = bin_rem[j] - weight[i];
                }
            }

            if( min == c + 1) {
                bin_rem[res] = c - weight[i];
                res++;
            }
            else {
                bin_rem[bi] = bin_rem[bi] - weight[i];
            }
        }

        return res;
    }
}
