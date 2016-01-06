import com.sun.glass.ui.SystemClipboard;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringJoiner;

/**
 * Created by chandresh.pancholi on 27/12/15.
 */
public class AlternatingString {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int inputNumbers = in.nextInt();

        int count = 0;

        int[] output = new int[inputNumbers];
        while (count < inputNumbers){
            int flag = 0;

            String inputString = in.next();


            Stack sc = new Stack();
            sc.push(inputString.charAt(0));

            for(int i = 1; i<inputString.length(); i++){
                if((Character)sc.peek()== inputString.charAt(i)){
                    flag++;
                } else{
                    sc.push(inputString.charAt(i));
                }
            }
            output[count] = flag;
            count++;
        }
        for(int i = 0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }
}
