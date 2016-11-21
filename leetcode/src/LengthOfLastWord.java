/**
 * Created by chandresh.pancholi on 18/07/16.
 */
public class LengthOfLastWord {
    public static void main(String[ ]args) {
        String input = " " ;

        String[] lastword = input.split(" ");
        System.out.println(lastword.length);
        System.out.println(lastword[lastword.length - 1]);

    }
}
