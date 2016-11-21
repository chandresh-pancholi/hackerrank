/**
 * Created by chandresh.pancholi on 14/07/16.
 */
public class WordBreakProblem {
    public static void main(String args[]) {
        boolean output = wordBreak("ilikesamsung");
        if(output) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean wordBreak(String str) {
        int len = str.length();
        boolean wb[] = new boolean[len + 1];

        for(int i = 1; i <= len; i++ ) {
            if(wb[i] == false && dictionaryContains(str.substring(0, i))) {
                wb[i] = true;
            }

            if(wb[i] == true) {
                if(i == len) {
                    return true;
                }

                for(int j = i + 1; j <= len; j++) {
                    if(wb[j] == false && dictionaryContains(str.substring(i, j-i))) {
                        wb[j] = true;
                    }
                    if( j == len && wb[j] == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dictionaryContains(String word) {
        String[] dictionary = {"mobile","samsung","sam","sung","man","mango",
                "icecream","and","go","i","like","ice","cream"};

        for(int i = 0; i < dictionary.length; i++) {
            if (dictionary[i].compareTo(word) == 0) {
                return true;
            }
        }

        return false;
    }
}
