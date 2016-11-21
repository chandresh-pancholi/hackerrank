/**
 * Created by chandresh.pancholi on 15/07/16.
 */
public class ImageRotation {
    public static void main(String[]args ) {
        int[][] input = {{1,2,3}, {4,5,6},{7,8,9}};

        for(int i = 0; i < input[0].length; i++) {
            for(int j = 0; j < input.length; j++) {
                input[i][j] = input[input.length - j - 1][i];
                System.out.println(input[i][j]);
            }
        }


    }
}
