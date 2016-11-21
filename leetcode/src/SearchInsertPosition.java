import java.util.Scanner;

/**
 * Created by chandresh.pancholi on 22/06/16.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] input = {1};
        int len = input.length;
        int target = 1;
        if( target > input[len-1]) {
            System.out.println(len);
        } else if (target < input[0]) {
            System.out.println(0);
        }
        else {
            System.out.println(bs(input, 0, len - 1, 1));
        }

    }

    public static int bs(int[] nums, int low, int high, int target) {
        int mid = (low + high) / 2;

        if(nums[mid] == target) {
            return mid;
        }
        else if(nums[mid] > target) {
            return bs(nums, low, mid - 1, target);
        } else {
            return bs(nums, mid + 1, high, target);
        }
    }
}
