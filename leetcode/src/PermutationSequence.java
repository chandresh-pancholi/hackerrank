import java.util.ArrayList;
import java.util.List;

/**
 * Created by chandresh.pancholi on 19/07/16.
 */
public class PermutationSequence {
    public static void main (String[] args) {
        int n = 3;
        int k = 6;

        System.out.println(getSequence(n, k));
    }

    private static String getSequence(int n, int k) {
        List<Integer> comboList = new ArrayList<>();

        for(int i = 1; i <=n; i++) {
            comboList.add(i);
        }

        int mod = 1;

        for(int i = 1; i <= n; i++) {
            mod = mod * i;
        }

        k--;

        int currentIndex;

        String result = "";

        for(int i = 0; i <n; i++) {
            mod = mod / (n-i) ;
            currentIndex = k / mod;

            k = k % mod;

            result += comboList.get(currentIndex);

            comboList.remove(currentIndex);
        }

        return result;
    }
}
