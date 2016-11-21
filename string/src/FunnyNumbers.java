
import java.util.Scanner;

/**
 * Created by chandresh.pancholi on 27/12/15.
 */
public class FunnyNumbers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int inputNumbers = in.nextInt();

        int count = 0;

        while (count < inputNumbers){
            boolean flag = true;
            String inputString = in.next();

            String reversedString = new StringBuffer(inputString).reverse().toString();

            for(int i = 0; i<inputString.length()-1; i++){
                if(Math.abs(inputString.charAt(i+1) - inputString.charAt(i)) !=
                        Math.abs(reversedString.charAt(i+1) - reversedString.charAt(i))){

                    System.out.println("Not Funny" + 2);

                    flag = false;

                    break;
                }
            }
            if (flag)
                System.out.println("Funny");
            count++;
        }


    }
}
