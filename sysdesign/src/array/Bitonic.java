package array;

/**
 * Created by user on 15/04/16.
 */
public class Bitonic {
    public static void main( String[] args) {
        int [] arr = {12, 4, 78, 90, 45, 23};
        int len = arr.length;

        int[] inc = new int[len];
        int[] dec = new int[len];

        inc[0] = 1;

        for(int i = 1; i < len; i++) {
            if(arr[i] > arr[i-1]) {
                inc[i] = inc[i-1] + 1;
            }
            else {
                inc[i] = 1;
            }
            System.out.print(inc[i] + " ");
        }
        System.out.println();
        dec[len-1] = 1;

        for(int j = len-2; j >= 0; j--) {
            if(arr[j] > arr[j+1]) {
                dec[j] = dec[j+1] + 1;
            }
            else {
                dec[j] = 1;
            }
            System.out.print(dec[j] + " ");
        }

        int max = inc[0] + dec[0] - 1;

        for(int i = 0; i < len; i++ ) {
            if( max < inc[i] + dec[i] - 1) {
                max = inc[i] + dec[i] - 1;
            }

        }

        System.out.println(max);
    }
}
