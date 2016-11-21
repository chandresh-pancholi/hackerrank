import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by chandresh.pancholi on 14/07/16.
 */
public class LeetCode40 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        combinationSum(candidates, target);
    }
    public static List<ArrayList<Integer>> combinationSum(int[] candidates, int target) {


        List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> current = new ArrayList<>();

        Arrays.sort(candidates);
        if(candidates.length == 0 || candidates == null) {
            return result;
        }

        comboDFS(candidates, target, 0, result, current);
        HashSet<ArrayList<Integer>> hs = new HashSet<>();

        for(ArrayList<Integer> al : result) {
            hs.add(al);
        }
        result.clear();
        result.addAll(hs);
        return result;
    }

    public static void comboDFS(int[] candidates, int target, int j, List<ArrayList<Integer>> result, ArrayList<Integer> current ) {
        if ( target == 0) {
            result.add(new ArrayList<Integer>(current));
            System.out.println(current.toString());
            return ;
        }

        for(int i = j; i < candidates.length; i++) {
            if(target < candidates[i]) {
                return;
            }

            current.add(candidates[i]);
            comboDFS(candidates, target-candidates[i], i+1, result, current);
            current.remove(current.size() - 1);
        }
    }
}
