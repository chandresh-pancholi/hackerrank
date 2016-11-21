import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by chandresh.pancholi on 19/06/16.
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();

        int n = Integer.parseInt(values.split(" ")[0]);
        int m = Integer.parseInt(values.split(" ")[1]);

        int[] input = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (input[i] == m) {
                count = i;
            }

        }
        if(count == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(count+1);
        }

    }
 }
