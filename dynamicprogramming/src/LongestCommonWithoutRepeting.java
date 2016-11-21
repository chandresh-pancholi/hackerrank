/**
 * Created by chandresh.pancholi on 10/03/16.
 */
public class LongestCommonWithoutRepeting {
    public static void main(String args[]) {
        String inputString = "GEEKSFORGEEKS";

        int curr_len = 1;
        int max_len = 1;
        int prev_index;

        int[] visited = new int[256];

        for(int i = 0; i < visited.length; i++) {
            visited[i] = -1;
        }

        visited[(int) inputString.charAt(0)] = 0;

        for(int i = 1; i < inputString.length(); i++) {
            prev_index = visited[(int) inputString.charAt(i)];

            if(prev_index == -1 || i - curr_len > prev_index){
                curr_len++;
            } else {
                if(curr_len > max_len) {
                    max_len = curr_len;
                }

                curr_len = i - prev_index;
            }
            visited[(int) inputString.charAt(i)] = i;

        }

        if(curr_len > max_len) {
            max_len = curr_len;
        }
        System.out.println(max_len);

    }

}
