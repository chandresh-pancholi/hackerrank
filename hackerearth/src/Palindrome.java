/**
 * Created by user on 18/09/16.
 */
public class Palindrome {
    public static void main(String[] args) {
        String input = "1221";
        System.out.println(isPalindrome(input));
    }

    public static String isPalindrome(String input) {
        int len = input.length();
        if (len == 0 || len == 1) {
            return "Palindrome";
        }

        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i) != input.charAt(len - i - 1)) {
                return "Not Palindrome";
            }
        }
        return "Palindrome";
    }
}
