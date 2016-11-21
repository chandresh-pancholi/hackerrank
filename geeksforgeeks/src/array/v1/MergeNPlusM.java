package array.v1;

/**
 * Created by chandresh.pancholi on 09/09/16.
 */
public class MergeNPlusM {
    public static void main(String[] args) {
        int[] input1 = {2, 8, 0, 0, 0 , 13, 0, 15, 20};
        int[] input2 = {5, 7, 9, 25};


        int len2 = input2.length;
        int len1 = input1.length - len2 ;

        input1 = moveToEnd(input1, len1 + len2);
        for (int i = 0; i < len1; i++) {
            System.out.print(input1[i] + " " );
        }
        System.out.println();
        int i = len2;
        int j = 0;
        int k = 0;

        while (k < len1 + len2) {
            if ((i < (len1 + len2) && input1[i] <= input2[j]) || j == len2) {
                input1[k] = input1[i];
                System.out.print(input1[k] + " ");
                k++;
                i++;
            } else {
                input1[k] = input2[j];
                System.out.print(input1[k] + " ");
                j++;
                k++;
            }
        }
     }

    private static int[] moveToEnd(int[] input1, int len1) {
        int j = len1 - 1;
        for (int i = len1 - 1; i >= 0; i--) {
            if (input1[i] != 0) {
                input1[j] = input1[i];
                j--;
            }
        }
        return input1;
    }
}
