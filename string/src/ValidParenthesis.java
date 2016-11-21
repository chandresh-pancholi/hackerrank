import java.util.Stack;

/**
 * Created by chandresh.pancholi on 15/09/16.
 */
public class ValidParenthesis {
    public static void main(String ...args) {
        String input = "{(sdfdsfs s fsd fs )}[]";
        int len = input.length();

        Stack sc = new Stack();
        int i = 0;
        while (i != len ) {
            if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
                sc.push(input.charAt(i));
            }
            if (input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']') {
                if (sc.size() == 0) {
                    System.out.print("Not valid");
                    break;
                } else if (!isValid((char)sc.pop(), input.charAt(i))) {
                    System.out.print("Not valid");
                    break;
                }
            }
            i++;
        }
        if (sc.size() == 0) {
            System.out.println("Valid ");
        } else {
            System.out.println("Not valid");
        }
        String Str = new String("Helloworld");

        System.out.println(Str.indexOf( 'w' ));
        System.out.println(Str.indexOf( 'e' ));

        System.out.println(func(Str, "w", "e"));

    }

    public static boolean isValid(char char1, char char2) {
        if (char1 == '{' && char2 == '}') {
            return true;
        } else if (char1 == '(' && char2 == ')') {
            return true;
        } else if (char1 == '[' && char2 == ']') {
            return true;
        } else {
            return false;
        }
     }
    public static int func(String s, String a, String b ) {
        return s.indexOf(a) != -1 && s.indexOf(b) != -1 ? ( Math.max(s.indexOf(a), s.indexOf(b))) : (s.indexOf(a) == -1 && s.indexOf(b) != -1 ? ( s.indexOf(b)) : (s.indexOf(a) != -1 && s.indexOf(b) == -1)  ?  s.indexOf(a) : -1);

    }

}
