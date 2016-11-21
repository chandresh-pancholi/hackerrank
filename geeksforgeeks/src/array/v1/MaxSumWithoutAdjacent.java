package array.v1;

/**
 * Created by chandresh.pancholi on 09/09/16.
 */
public class MaxSumWithoutAdjacent {
    public static void main(String[] args) {
        int[] input = {5,  5, 10, 40, 50, 35};
        int len = input.length;

        int incl = input[0];
        int excl = 0;
        int excel_new;

        for (int i = 1; i < len; i++) {
            excel_new = Math.max(incl, excl);
            incl = excl + input[i];
            excl = excel_new;
        }

        System.out.println(Math.max(incl, excl));
    }
}
