/**
 * Created by chandresh.pancholi on 27/07/16.
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        int i = a.length() - 1;
        int j = b.length() - 1;
        int flag = 0;

        StringBuffer sb = new StringBuffer();

        while (i >= 0 || j >= 0) {
            int valueA = 0;
            int valueB = 0;

            if (i >= 0) {
                valueA = a.charAt(i) == '0' ? 0 : 1;
                i--;
            }
            if (j >= 0) {
                valueB = b.charAt(j) == '0' ? 0 : 1;
                j--;
            }
            int sum = valueA + valueB + flag;

            if (sum >= 2) {
                sb.append(String.valueOf(sum - 2));
                flag = 1;
            } else {
                sb.append(String.valueOf(sum));
                flag = 0;
            }
        }
        if (flag == 1) {
            sb.append(String.valueOf(1));
        }
        System.out.println(sb.reverse().toString());
    }
}
