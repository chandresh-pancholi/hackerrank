import java.util.Date;

/**
 * Created by chandresh.pancholi on 17/07/16.
 */
public class CodeFightChallange {
    public static void main(String[] args) {
        long t1 = new Date().getTime();

        int[][] input = {{4, 1},
                {4, -1},
                {0, 0},
                {6, 1}};
        int m = input.length;

        double count = 0;
        double sum = 0;

        for (int i = 0; i < m; i++) {
            if (input[i][1] == 1) {
                sum += input[i][0];
                count++;
            }
        }

        System.out.println(sum / count);
        long t2 = new Date().getTime();

        System.out.println( t2 - t1);
    }
}
