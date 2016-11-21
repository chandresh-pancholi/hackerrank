package array.v1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by chandresh.pancholi on 09/09/16.
 */
public class PairSum {
    public static void main(String[] args) {
        int[] input = {1, 4, 45, 6, 10, 8};
        int k = 16;
        int len = input.length;

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < len; i++) {
            if (hm.get(k - input[i]) != null) {
                System.out.println(input[i] + " " + (k - input[i]));
            } else  {
                hm.put(input[i], true);
            }
        }
    }

}
