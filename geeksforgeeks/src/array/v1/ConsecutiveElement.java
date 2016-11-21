package array.v1;

/**
 * Created by chandresh.pancholi on 10/09/16.
 */
public class ConsecutiveElement {
    public static void main(String[] args) {
        int[] input = {5, 4, 2, 3, 1, 6};
        int len = input.length;

        int min = getMin(input);
        int max = getMax(input);

        if (max - min + 1 == len ) {
            boolean[] visited = new boolean[len];
            for (int i = 0; i < len; i++) {
                if (visited[input[i] - min] != false) {
                    System.out.println(false);
                    break;
                }
                visited[input[i] - min] = true;
            }
            System.out.print(true);
        } else {
            System.out.println(false);
        }

    }

    private static int getMax(int[] input) {
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    private static int getMin(int[] input) {
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i] ;
            }
        }
        return min;
    }


}
