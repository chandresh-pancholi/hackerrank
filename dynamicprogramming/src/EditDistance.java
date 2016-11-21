/**
 * Created by chandresh.pancholi on 09/03/16.
 */
public class EditDistance {
    public static void main(String args[]) {
        String s1 = "sunday";
        String s2 = "saturday";

        int[][] temp = new int[s1.length() + 1][s2.length() + 1];

        for(int i = 0; i <= s1.length(); i++) {
            for(int j = 0; j <= s2.length(); j++) {
                if( i == 0){
                    temp[i][j] = j;
                } else if(j == 0) {
                    temp[i][j] = i;
                } else {
                    if(s1.charAt(i-1) == s2.charAt(j-1)) {
                        temp[i][j] = temp[i-1][j-1];
                    } else {
                        temp[i][j] = 1 + Math.min(temp[i-1][j], Math.min(temp[i][j-1], temp[i-1][j-1]));
                    }
                }
            }
        }

        System.out.print(temp[s1.length()][s2.length()]);
    }
}
