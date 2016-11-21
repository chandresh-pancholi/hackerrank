import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chandresh.pancholi on 19/05/16.
 */
public class LetterCombination {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        List<String> list = new ArrayList<>();

        int number = 234;
        int count = 1;

        hm.put(2, "abc");
        hm.put(3, "def");
        hm.put(4, "ghi");
        hm.put(5, "jkl");
        hm.put(6, "mno");
        hm.put(7, "pqrs");
        hm.put(8, "tuv");
        hm.put(9, "wxyz");

        int temp = number % 10;
        number = number / 10;

        String s1 = hm.get(temp);
        for (int i = 0; i < s1.length(); i++) {
            list.add(s1.charAt(i)+"");
            System.out.println(list.get(i).length());
        }
        while(number != 0) {

            temp = number % 10;
            int len = list.size();
            String s2 = hm.get(temp);

            for(int i = 0; i < s2.length(); i++) {
                for (int j = 0; j < len; j++) {
                    list.add((s2.charAt(i)+list.get(j)));
                }
            }
            number = number / 10;
            count++;



        }

        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == count) {
                result.add(list.get(i));
            }
        }
        System.out.println(result.toString());
    }
}
