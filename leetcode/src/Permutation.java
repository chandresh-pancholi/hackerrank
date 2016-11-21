import java.util.ArrayList;
import java.util.List;

/**
 * Created by chandresh.pancholi on 15/07/16.
 */
public class Permutation {
    public static void main(String[] args) {
        int[] input = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        permute(input, 0, input.length - 1, result, current);
        for(List<Integer> l : result) {
            System.out.println(l);
        }

    }

    public static void permute(int[] input, int l, int r, List<List<Integer>> result, List<Integer> current) {
        if(l == r) {
            for(int i = 0; i<input.length; i++) {
                current.add(input[i]);
            }
            result.add(new ArrayList<>(current));
            current.clear();
        }

        else {
            for(int i = l; i <= r; i++ ) {
                int temp = input[l];
                input[l] = input[i];
                input[i] = temp;

                permute(input, l + 1, r, result, current);

                temp = input[l];
                input[l] = input[i];
                input[i] = temp;
            }
        }
    }
}
