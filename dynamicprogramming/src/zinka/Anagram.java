package zinka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by chandresh.pancholi on 18/05/16.
 */
public class Anagram {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        System.out.println(total);
        int count = 0;
        while (count < total*2) {


            char[] c1 = sc.next().toLowerCase().toCharArray();
            char[] c2 = sc.next().toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if(c1.length != c2.length) {
                System.out.println("NO");
            } else if(new String(c1).equals(new String(c2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            count++;
        }


    }
}
