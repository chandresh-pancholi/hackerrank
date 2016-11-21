package dp;

/**
 * Created by user on 14/04/16.
 */
public class CoinChange {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int coin = 4;

        int x;
        int y;

        int [][] table = new int[coin+1][arr.length];

        for(int i = 0; i<arr.length; i++) {
            table[0][i] = 1;
        }

        for(int i = 1; i < coin + 1; i++) {
            for(int j = 0; j < arr.length; j++ ) {
                x = (i - arr[j] >= 0) ? table[i - arr[j]][j] : 0;
                y = (j >= 1) ? table[i][j-1] : 0 ;

                table[i][j] = x + y;
            }
        }

        for(int i = 0; i < coin + 1; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(table[i][j] + " ");

            }
            System.out.println();
        }

    }
}
