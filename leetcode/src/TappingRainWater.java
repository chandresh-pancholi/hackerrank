/**
 * Created by chandresh.pancholi on 14/07/16.
 */
public class TappingRainWater {
    public static void main(String[] args) {
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};

        int[] left = new int[input.length];
        int[] right = new int[input.length];

        left[0] = input[0];
        for(int i = 1; i < input.length; i++) {
            left[i] = Math.max(left[i - 1], input[i]);
        }

        right[input.length - 1] = input[input.length - 1];

        for(int i = input.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], input[i]);
        }

        int sum = 0;
        for(int i = 0; i < input.length; i++) {
            sum += Math.min(left[i],right[i]) - input[i];
        }

        System.out.println(sum);


    }

}
