import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chandresh.pancholi on 08/03/16.
 */
public class ThreeSum {
    public static void main(String args[]) {
        int[] nums = {-3,14,-10,-1,12,13,-3,2,-6,4,13,7,-8,4,0,-13,11,-4,7,0,4,-3,12,11,5,-14,-8,8,3,-1,-8,-15,-2,-11,-9,-12,9,3,5,-11,-8,3,3,-9,-15,-12,-15,3,-9,0,-12,3,12,-14,-1,-6,-13,-2,-13,-3,12,-14,-3,-13,-9,3,-10,-15,13,2,11,13,-9,-1,11,13,-6,4,1,1,-11,5,-11,8,-2,-5,-12,-8,8,-10,4,-3,-8,-14,-1,-10,-4,-3,12,-14,14,9,6,12,-15,3,10,-13,-8,-11,3,-4,1,-1};
        List<List<Integer>> output = threeSum(nums);
        System.out.println("==== " + output);
    }

    public static List<List<Integer>>  threeSum(int[] nums) {

        List<List<Integer>> outputList = new ArrayList();


        if(nums.length == 0 || nums.length == 1 || nums.length == 2)
            return outputList;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++ ) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right ) {
                if(nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> insideList = new ArrayList();
                    insideList.add(nums[i]);
                    insideList.add(nums[left]);
                    insideList.add(nums[right]);

                    outputList.add(insideList);
                    left++;
                    right--;
//                    int m = left + 1;
//                    while (m < right && nums[j] == nums[m]) { ++m; }
//                    left = m;
                } else if(nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else{
                    left++;
                }
            }
        }
        return outputList;
    }
}
