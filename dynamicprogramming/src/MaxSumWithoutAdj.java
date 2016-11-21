/**
 * Created by chandresh.pancholi on 17/06/16.
 */
public class MaxSumWithoutAdj {
    public static void main(String[] args) {
        int[] input = {5, 5, 10, 100, 10, 5};
        int incl = input[0];

        int excl = 0;
        int excl_new;
        int i;

        for (i = 1; i < input.length; i++)
        {
             /* current max excluding i */
            excl_new = (incl > excl)? incl: excl;
            System.out.println(" Excl new " + excl_new);

            /* current max including i */
            incl = excl + input[i];
            System.out.println(" Incl " + incl);
            excl = excl_new;
            System.out.println(" Excl " + excl);
        }
        System.out.println(((incl > excl)? incl : excl));
    }
}
