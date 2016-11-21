/**
 * Created by chandresh.pancholi on 22/06/16.
 */
public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        if(n < 0) {
            System.out.println("Fuck off");
        }
        String result = "1";
        int i = 1;

        while (i < n) {
            StringBuffer sb = new StringBuffer();
            int count = 1;

            for(int j = 1; j < result.length(); j++) {
                if(result.charAt(j) == result.charAt(j-1)) {
                    count++;
                }
                else {
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                }
            }

            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
            i++;
        }
        System.out.println(result);
    }

}
