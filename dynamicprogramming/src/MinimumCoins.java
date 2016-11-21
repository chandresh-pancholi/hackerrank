/**
 * Created by chandresh.pancholi on 19/06/16.
 */
public class MinimumCoins {
    public static void main(String[] args) {
        int coins[] =  {9, 6, 5, 1};
        int V = 11;
        System.out.println(minCoin(coins, V));
    }

    public static int minCoin(int[] coins, int V) {
        int len = coins.length;
        int[] table = new int[V + 1];

        table[0] = 0;
        for(int i = 1; i <= V; i++) {
            table[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= V; i++) {
            for(int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
            }
        }
        return table[V];
    }

}






