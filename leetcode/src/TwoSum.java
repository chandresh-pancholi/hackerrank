import java.util.HashMap;

/**
 * Created by chandresh.pancholi on 19/05/16.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] init = {0, 7, 11, 0};
        int number = 0;
        int[] output = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < init.length; i++) {
            int temp = number - init[i];
            if (hm.get(temp) == null) {
                hm.put(init[i], i);
            } else {
                output[0] = hm.get(temp);
                output[1] = i;

                System.out.println(output[0] + "  " + output[1]);
            }
        }

        System.out.println(hm.toString());
    }
}
