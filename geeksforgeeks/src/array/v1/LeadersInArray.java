package array.v1;

/**
 * Created by chandresh.pancholi on 09/09/16.
 */
public class LeadersInArray {
    public static void main(String[] args) {
        int[] input = {16, 17, 4, 3, 5, 2};
        int len  = input.length;
        int leader = input[len - 1 ];
        System.out.print(leader + " ");

        for (int i = len - 2; i >= 0; i--) {
            if (input[i] > leader) {
                leader = input[i];
                System.out.print(leader + " ");
            }
        }
    }
}
