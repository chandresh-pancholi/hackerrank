import java.util.Arrays;

/**
 * Created by chandresh.pancholi on 29/07/16.
 */
public class ReplaceString {
    public static void main(String [] args) {
        String input1 = "Mr. John Smith   ";
        System.out.println(input1.trim().replaceAll(" ", "%20"));

        char[] input = {'M','r','.',' ','J','O','H','N',' ','S','M','I','T','H',' ',' ',' ',' '};


        int len = input.length;

        input = trimInput(input, len);
        for (int i = 0; i < len; i++) {
            System.out.print(input[i] );
        }
        System.out.print(".");
    }

    private static char[] trimInput(char[] input, int len) {
        int start = 0;
        int end = len - 1;

        for (int i = 0; i < len; i++) {
            if (input[i] == ' ' && start == i) {
                start++;
            }
        }
        System.out.println(start);
        for (int i = len - 1; i >= 0; i--) {
            if (input[i] == ' ' && end == i) {
                end--;
            } else if (input[i] == ' ') {
//                input[i] = '%20'
            }
        }
        System.out.println(end);
        Arrays.copyOf(input, end - start);
        return input;

    }
}
