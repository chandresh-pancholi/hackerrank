/**
 * Created by chandresh.pancholi on 10/08/16.
 */
public class WildCardMatching {
    public static void main(String[] args) {
        String s = "aaab";
        String pat = "*a";

        System.out.println(isMatch(s, pat));
    }

    private static boolean isMatch(String s, String pat) {
        int i = 0;
        int j = 0;
        int starIndex = -1;
        int iIndex = -1;

        while (i < s.length()) {
            if (j < pat.length() &&
                    (pat.charAt(j) == '?' ||  pat.charAt(j) == s.charAt(i) ) ) {
                i++;
                j++;
            } else if(j < pat.length() && pat.charAt(j) =='*') {
                starIndex = j;
                iIndex = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                return false;
            }
        }
        while (j < pat.length() && pat.charAt(j) == '*') {
            j++;
        }

        return j == pat.length();
    }



}
