/**
 * Created by chandresh.pancholi on 20/07/16.
 */
public class StringToAtoi {
    public static void main(String [] args) {
        String str = "    010".trim();

        char flag = '+';
        int i = 0;

        if(str.charAt(i) == '-') {
            flag = '-';
            i++;
        }
        else if(str.charAt(i) == '+'){
            i++;
        }

        double result = 0;
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result*10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-'){
            result = -result;
        }

        if(result > Integer.MAX_VALUE) {
            System.out.println(Integer.MAX_VALUE);
        }
        else if(result < Integer.MIN_VALUE) {
            System.out.println(Integer.MIN_VALUE);
        }

        System.out.println((int) result);
    }
}
