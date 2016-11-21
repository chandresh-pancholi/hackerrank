package v0;

/**
 * Created by chandresh.pancholi on 02/08/16.
 */
public class DutchFlag {

    public static void main(String[] args) {
        char[] balls = {'G', 'G', 'B', 'B', 'R', 'R', 'G', 'B', 'R', 'B', 'B'};
        int low = 0;
        int high = balls.length - 1;
        int mid = 0;

        while(mid <= high) {
            if(balls[mid] == 'R') {
                char temp = balls[low];
                balls[low] = balls[mid];
                balls[mid] = temp;

                low++;
                mid++;
            } else if(balls[mid] == 'G') {
                mid++;
            } else if(balls[mid] == 'B') {
                char temp = balls[mid];
                balls[mid] = balls[high];
                balls[high] = temp;

                high--;
            }
        }
        for (int i = 0; i < balls.length ; i++) {
            System.out.print(balls[i] + " ");
        }
    }
}
