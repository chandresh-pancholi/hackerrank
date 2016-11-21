/**
 * Created by chandresh.pancholi on 07/08/16.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String input = "forgeeksskeegfor";
        int len = input.length();

        int low;
        int high;
        int maxLength = 0;

        for (int i = 1; i < len; i++) {
            low = i-1;
            high = i;

            while (low >= 0 &&  high < len && input.charAt(low) == input.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }

            low = i-1;
            high = i+1;

            while (low >= 0 && high < len && input.charAt(low) == input.charAt(high) ) {
                if (high - low + 1 > maxLength) {
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }
        }
        System.out.println(maxLength);
    }
}
