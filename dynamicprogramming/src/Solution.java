public class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int low = 0 ;
        int high = 0;
        int len = s.length();
        int maxLen = 1;

        if(len == 1 || len == 0) {
            return s;
        }
        else if( len == 2 && s.charAt(0) == s.charAt(1) ) {
            return s;
        }

        for(int i = 1; i < len; i++) {
            low = i - 1;
            high = i;

            while(low >= 0 && high < len && s.charAt(low) == s.charAt(high) ) {
                if(high - low + 1 > maxLen) {
                    maxLen = high - low + 1;
                    start = low;
                }

                --low;
                ++high;
            }
            low = i - 1;
            high = i + 1;

            while(low >= 0 && high < len && s.charAt(low) == s.charAt(high) ) {
                if(high - low + 1 > maxLen) {
                    maxLen = high - low + 1;
                    start = low;
                }
                --low;
                ++high;
            }
        }
        return s.substring(start, start + maxLen - 1);
    }
}