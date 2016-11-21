import java.util.Arrays;

/**
 * Created by chandresh.pancholi on 23/06/16.
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] input = {1000, -1};

        int j = 0;
        for(int i = 0; i < input.length; i++) {
            if(input[i] <= 0) {
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;

                j++;
            }

        }

        int size = input.length - j;
        for(int i = 0; i < size; i++) {
            if((Math.abs(input[i]) - 1 < size) && input[Math.abs(input[i]) - 1 ] > 0) {
                input[Math.abs(input[i]) - 1] = -input[Math.abs(input[i]) - 1];
            }
        }


        for(int i = j; i < size; i++)
            if (input[i] > 0)
                System.out.println( i+1);  // 1 is added becuase indexes start from 0

        System.out.println(size+1);
    }
}
