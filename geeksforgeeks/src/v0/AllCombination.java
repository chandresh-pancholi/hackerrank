package v0;

/**
 * Created by chandresh.pancholi on 18/07/16.
 */
public class AllCombination {
    static int[] arr = new int[100];
    public static void main(String[] args) {
        int n = 3;

        printCombination(n, 0);
    }

    private static void printCombination(int n, int count) {


        if( n == 0) {
            for(int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        else if (n > 0) {
            for(int k = 1; k <= 3; k++) {
                arr[count] = k;
                printCombination(n-k, count + 1);
            }
        }
    }
}
