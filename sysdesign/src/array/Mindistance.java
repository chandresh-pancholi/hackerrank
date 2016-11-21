package array;

/**
 * Created by user on 14/04/16.
 */
public class Mindistance {
    public static void main(String args[]) {
        int[] arr = {3, 5, 4, 2, 8, 3, 0, 0, 6, 4, 8, 3};
        int len = arr.length;

        int x = 3;
        int y = 6;

        int prev = 0;
        int i ;
        int min_distance = Integer.MAX_VALUE;
        for (i = 0; i < len; i++) {
            if(arr[i] == x || arr[i] == y) {
                prev = i;
                break;
            }
        }

        for(; i < len; i++){
            if(arr[i] == x || arr[i] == y) {
                if(arr[i] != arr[prev] && (i - prev) < min_distance) {
                    min_distance = i - prev;
                    prev = i;
                }
                else {
                    prev = i;
                }
            }
        }

        System.out.println(min_distance);
    }
}
