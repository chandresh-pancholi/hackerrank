/**
 * Created by chandresh.pancholi on 27/07/16.
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] input = {8, 9, 9, 9};
        int len = input.length;

        int carry = 1;
       
        for (int i = len - 1; i >= 0; i--) {
            int sum = input[i] + carry;
            if (sum >= 10) {
                carry = 1;
                input[i] = sum % 10;
            }
            else {
                carry = 0;
                input[i] = sum % 10;
            }
        }

        int[] digit;
        if (carry == 1) {
            digit = new int[len + 1];
            digit[0] = carry;

            for (int i = 1; i < len; i++) {
                digit[i] = input[i];
            }

        }
        else {
            digit = new int[len ];
            for (int i = 0; i < len; i++) {
                digit[i] = input[i];
            }

        }



    }
}
