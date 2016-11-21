package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 09/04/16.
 */
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toUpperCase();

        System.out.println(s1);
        String indexes = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Integer> input = new ArrayList<>();
        int[] countArray = new int[26];

        for(int i = 0; i < s1.length(); i++ ) {
            int index = indexes.indexOf(s1.charAt(i));

            if(index < 0) {
                continue;
            }
            countArray[index]++;
        }

        for (int i = 0; i < countArray.length; i++) {
            System.out.print(countArray[i] + " ");
        }

    }
}
