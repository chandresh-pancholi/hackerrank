/**
 * Created by chandresh.pancholi on 10/03/16.
 */
public class NoOfJumps {
    public static void main(String args[]) {
        int [] inputArr = {1, 3, 6, 1, 0, 9};

        int[] jumps = new int[inputArr.length];

        jumps[0] = 0;

        for (int i = 1; i < inputArr.length; i++) {
            jumps[i] = Integer.MAX_VALUE;

            for (int j = 0; j < i; j++) {
                if(i <= j + inputArr[j] && jumps[j] != Integer.MAX_VALUE ) {
                   jumps[i] = Math.min(jumps[i], jumps[j] + 1);

                    break;
                }
            }
        }

        for(int i = 0; i < jumps.length; i++) {
            System.out.println(jumps[i]);
        }

        System.out.println(jumps[inputArr.length - 1]);
    }
}
