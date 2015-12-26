import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by chandresh.pancholi on 27/12/15.
 */
public class panagram {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine().replace(" ","").toLowerCase();
        Set<Character> hs = new HashSet<>();
        for(int i = 0; i<inputString.length(); i++){
            hs.add(inputString.charAt(i));
        }

        String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        int i = 0;
        while (i<temp.length()){
            if(!hs.contains(temp.charAt(i))){
                System.out.println("not pangram");
                System.exit(0);
            }else{
                i++;
            }
        }
        System.out.println("pangram");


    }
}
