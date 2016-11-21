import java.util.Scanner;

/**
 * Created by chandresh.pancholi on 19/06/16.
 */
public class RestInPiece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            String input = sc.next();
            if(input.contains("21") || Integer.parseInt(input) % 21 == 0) {
                System.out.println("The streak is broken!");
            }
            else {
                System.out.println("The streak lives still in our heart!");
            }
        }
    }
}
