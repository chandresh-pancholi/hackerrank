/**
 * Created by chandresh.pancholi on 21/03/16.
 */
public class BitonicArray {
    public static void main (String args[] ) {
        int [] inputArray  = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
                13, 3, 11, 7, 15};

        System.out.println(" Bitonic array length == " + bitonicArrayLength(inputArray));
    }

    private static int bitonicArrayLength(int[] inputArray) {

        int len = inputArray.length;

        int[] lis = new int[len];

        for(int i = 0; i < lis.length; i++) {
            lis[i] = 1;
        }

        for (int i = 1; i < len; i++ ) {
            for(int j = 0; j < i; j++) {
                if(inputArray[i] > inputArray[j] && lis[i] < lis[j] + 1 )
                    lis[i] = lis[j] + 1;
            }
        }

        int[] lds = new int[inputArray.length];

        for(int i = 0; i < lds.length; i++) {
            lds[i] = 1;
        }

        for(int i = len - 2; i >= 0; i--) {
            for(int j = len - 1; j > i; j--) {
                if(inputArray[i] > inputArray[j] && lds[i] < lds[j] + 1) {
                    lds[i] = lds[j] + 1;
                }
            }
        }

        int max = lis[0] + lds[0] - 1;

        for(int i = 0; i < len; i++) {
            if(lis[i] + lds[i] -1 > max) {
                max = lis[i] + lds[i] - 1;
            }
        }
        return  max;
    }
}
