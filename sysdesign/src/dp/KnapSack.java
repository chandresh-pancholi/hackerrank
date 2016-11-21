package dp;

/**
 * Created by user on 14/04/16.
 */
public class KnapSack {
    public static void main(String[] args) {
        int [] val = {60, 100, 120};
        int [] wt = {1, 2, 3};
        int W = 5;

        int[][] table = new int[wt.length + 1][W+1];
        for(int i = 0 ; i <= wt.length; i++) {
            for(int w = 0; w <= W; w++) {
                if(i == 0 || w == 0) {
                    table[i][w] = 0;
                }
                else if(wt[i-1] <= w){
                    table[i][w] = Math.max(val[i-1] + table[i-1][w-wt[i-1]], table[i-1][w]);
                }
                else {
                    table[i][w] = table[i-1][w];
                }
            }
        }

        for(int i = 0; i < wt.length + 1; i++) {
            for(int j = 0; j<=W; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
