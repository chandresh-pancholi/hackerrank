/**
 * Created by chandresh.pancholi on 09/09/16.
 */
public class InplaceStringTransform {
    public static void main(String ...args) {
        String input = "a1b2c3d4e5f6g7";
        int len = input.length();

        int  shift = 0;
        while (len >= 0) {
            int k = 0;
            while (Math.pow(3, k) <= len) {
                k++;
            }

            int lenFirst = (int)(Math.pow(3, k - 1)) + 1;
            len = len - lenFirst;

        }

        input = cycleLeader(input, shift, len);
        System.out.println(input.toString());

    }

    private static String cycleLeader(String input, int shift, int len) {
        char[] tempArr = input.toCharArray();
        int j;
        int item;

        for (int i = 1; i < len; i *= 3) {
            j = i;
            item = j + shift;
            do {
                if (j % 2 == 1) {
                    j = len/2 + j/2;
                } else {
                    j = j/2;
                }
                char temp = tempArr[item];
                tempArr[item] = tempArr[j + shift];
                tempArr[j + shift] = temp;
            } while (j != i);
        }
        return String.valueOf(tempArr);
    }
}
