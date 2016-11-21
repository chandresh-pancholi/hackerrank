/**
 * Created by chandresh.pancholi on 14/07/16.
 */
public class CutRopMaximumProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(10));
    }

    private static int maxProduct(int n) {
        int[] temp = new int[11];
        temp[0] = 0;
        temp[1] = 0;

        for(int i = 1; i <= n; i++) {
            int max_val = 0;
            for(int j = 1; j <= i/2; j++) {
                max_val = Math.max(max_val, Math.max(j*(i-j), temp[i-j]*j));
            }
            temp[i] = max_val;
        }
        return temp[10];
    }

}
