/**
 * Created by chandresh.pancholi on 11/08/16.
 */
public class ValidNumber {
    public static void main(String[] args) {
        String input = "e9";
        System.out.println(isValidNumber(input.toLowerCase().replace(" ","")));
    }

    public static boolean isValidNumber(String input) {
        input = input.replace(" ", "");
        if (input.length() == 0) {
            return false;
        }
        int len = input.length();

        int i = 0;
        boolean dig = false;
        boolean dot = false;
        boolean e = false;

        while (i < len - 1) {
            if (i == 0) {
                if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                    if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '.') {
                        if (input.charAt(i) == '.') {
                            dot = true;
                        }
                        if (len == 1) {
                            return false;
                        }
                    }
                } else {
                    dig = true;
                }
                i++;
            } else {
                switch (input.charAt(i)) {
                    case 'e':
                        if (e == false && (input.charAt(i - 1) != '+' && input.charAt(i - 1) != '-') && dig && i != len) {
                            e = true;
                        } else {
                            return false;
                        }
                        break;
                    case '+':
                        if (input.charAt(i - 1) == 'e' && dig) {
                        } else {
                            return false;
                        }
                        break;
                    case '-':
                        if (input.charAt(i - 1) == 'e' && dig) {
                        } else {
                            return false;
                        }
                        break;
                    case '.':
                        if (!dot && !e) {
                            dot = true;
                        } else {
                            return false;
                        }
                        break;
                    case ' ':
                        break;
                    default:
                        if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                            return false;
                        } else {
                            dig = true;
                        }
                        break;
                }
                i++;
                continue;
            }

        }

        if (input.charAt(len - 1) >= '0' && input.charAt(len - 1) <= '9' || input.charAt(len - 1) == ' ') {
            return true;
        }
        if (input.charAt(len - 1) == '.' && !dot && !e && input.charAt(len - 2) >= '0' && input.charAt(len - 1) <= '9') {
            return true;
        }
        return false;
    }

}
