import java.util.*;

/**
 * Created by chandresh.pancholi on 16/07/16.
 */
public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, List<String>> hm  = new HashMap<>();

        int len = input.length-1;

        for(int i = 0; i <= len; i++) {
            String temp = input[i];
            char[] tim = temp.toCharArray();
            Arrays.sort(tim);
            String sortedString = new String(tim);

            if(hm.get(sortedString) != null) {
                List<String> lis = hm.get(sortedString);
                lis.add(input[i]);
                hm.put(sortedString,lis);
            }
            else {
                List<String> lis = new ArrayList<>();
                lis.add(input[i]);
                hm.put(sortedString, lis);
            }
        }

        List<List<String>> output = new ArrayList<>();

        for (Map.Entry entry : hm.entrySet()) {
            output.add((List<String>)entry.getValue());
        }

        System.out.println(output);
    }


}
