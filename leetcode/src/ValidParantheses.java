import java.util.Stack;

/**
 * Created by chandresh.pancholi on 20/05/16.
 */
public class ValidParantheses {
    public static void main(String[] args) {
        String input = "()()";
        System.out.println(isValidParanthes(input));
    }

    public static boolean isValidParanthes(String input) {
        Stack sc = new Stack();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);


            if(c == '(' || c == '{' || c == '[') {
                sc.push(c);
            }
            if( c == ')' || c == '}' || c == ']') {
                if(sc.empty()) {
                    return false;
                }
                else if(!isParantheseMatching(c, (Character)sc.pop())) {
                    return false;
                }

            }
        }

        if(sc.empty()) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean isParantheseMatching(char c, char pop) {
        if(c == ')' && pop == '(') {
            return true;
        } else if(c == '}' && pop == '{') {
            return true;
        } else if (c == ']' && pop == '[') {
            return true;
        } else
            return false;
    }
}
