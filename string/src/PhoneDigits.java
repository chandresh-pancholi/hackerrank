/**
 * Created by chandresh.pancholi on 08/08/16.
 */
public class PhoneDigits {
    static int count = 0;
    static char[][] hashtable = {{' '}, {' '}, {'a','b','c'}, {'d','e','f'}, {'g','h','i'}, {'j','k','l'},
            {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
    public static void main(String[] args) {

        int[] number = {2,3 ,4};
        int len = number.length;

        char[] result = new char[len+1];
        result[len] = '\0';

        printUtil(number, 0, result, len);
        System.out.println(count);

    }

    public static void printUtil(int[] number, int cur_digit, char[] result, int len) {
        if (cur_digit == len) {
            count++;
            for (int i = 0; i < len; i++) {
                System.out.print(result[i]+ " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < hashtable[number[cur_digit]].length; i++) {
            result[cur_digit] = hashtable[number[cur_digit]][i];
            printUtil(number, cur_digit+1, result, len);

//            if (number[cur_digit] == 0 || number[cur_digit] == 1) {
//                return;
//            }
        }
    }

}
