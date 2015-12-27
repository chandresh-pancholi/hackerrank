import com.sun.tools.javac.util.ArrayUtils;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by chandresh.pancholi on 27/12/15.
 */
public class AlternatingString {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int inputNumbers = in.nextInt();

        int count = 0;

        while (count < inputNumbers){
            String inputString = in.next();
            char[] output = new char[inputString.length()];
            int j = 0;
            int i = 0;
            while (i < inputString.length()-1){
                if(inputString.charAt(i) != inputString.charAt(i+1)){
                    output[j] = inputString.charAt(i);
                    j++;
                    i++;
                }
                else if (i+1 == inputString.length()){
                    output[j] = inputString.charAt(i+1);
                } else{
                    i++;
                }
            }
            for(int k = 0; k<output.length; k++){
                System.out.println(output[k]);
            }
        }
    }
}
