package array;

/**
 * Created by user on 08/04/16.
 */
public class StrictlyIncresingSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int n = arr.length;

        int cnt = 0;  // Initialize result

        // Initialize length of current increasing
        // subarray
        int len = 1;

        // Traverse through the array
        for (int i=0; i < n-1; ++i)
        {
            // If arr[i+1] is greater than arr[i],
            // then increment length
            if (arr[i + 1] > arr[i])
                len++;

                // Else Update count and reset length
            else
            {
                cnt += (((len - 1) * len) / 2);
                len = 1;
            }
        }

        // If last length is more than 1
        if (len > 1)
            cnt += (((len - 1) * len) / 2);

        System.out.println(" count == " + cnt);
    }



}
