/**
 * Created by chandresh.pancholi on 16/07/16.
 */
public class Power {
    public static void main(String[] args) {
        double x = 2;
        int y = 5;

        System.out.println(power(x, y));
    }

    private static double power(double x, int y) {
        double temp;

        if (y == 0 ) {
            return 1;
        }

        temp = power(x, y/2);
        if(y % 2 == 0) {
            return temp*temp;
        }
        else {
            if (y > 0) {
                return x*temp*temp;
            }
            else {
                return temp*temp/x;
            }
        }

    }
}
