/**
 * Created by chandresh.pancholi on 08/03/16.
 */
public class LongestCommonSequence {
    public static void main(String args[]) {
        String stringA = "AGGTAB";
        String stringB = "GXTXAYB";

        int[][] lcs = new int[stringA.length() + 1][stringB.length() + 1];

        for (int i = 0; i <= stringA.length(); i++) {
            for (int j = 0; j <= stringB.length(); j++) {
                if(i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else {
                    if(stringA.charAt( i - 1) == stringB.charAt( j - 1 )) {
                        lcs[i][j] = lcs[i-1][j-1]  + 1;
                    } else {
                        lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                    }
                }
            }
        }

        System.out.println(lcs[stringA.length()][stringB.length()]);
    }
}
