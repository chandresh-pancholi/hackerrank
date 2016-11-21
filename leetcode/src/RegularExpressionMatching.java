/**
 * Created by chandresh.pancholi on 10/08/16.
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "aab";
        String pat = ".*";

        System.out.println(isMatch(s, pat));
    }

    private static boolean isMatch(String s, String pat) {
        if (pat.length() == 0) {
            return s.length() == 0;
        }

        if (pat.length() == 1) {
            if (s.length() < 1) {
                return false;
            }
            else if(s.charAt(0) != pat.charAt(0) && pat.charAt(0) != '*') {
                return false;
            } else {
                return isMatch(s.substring(1), pat.substring(1));
            }
        }
        if (pat.charAt(1) != '*') {
            if (s.length() < 1) {
                return false;
            }
            if (pat.charAt(0) != s.charAt(0) && pat.charAt(0) != '.') {
                return false;
            } else {
                return isMatch(s.substring(1), pat.substring(1));
            }
        } else {
            if (isMatch(s, pat.substring(2))) {
                return true;
            }

            int i  = 0;
            while (i < s.length() && (s.charAt(i) == pat.charAt(0) || pat.charAt(0) == '.')) {
                if (isMatch(s.substring(i+1), pat.substring(2))) {
                    return true;
                }
                i++;
            }
            return false;
        }
    }

}
