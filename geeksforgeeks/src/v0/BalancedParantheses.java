package v0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chandresh.pancholi on 17/07/16.
 */
public class BalancedParantheses {
    public static void main(String[] args) {
        int n = 4;
        if(n > 0) {
            balancedParantheses(0, n, 0, 0);
        }
    }

    private static void balancedParantheses(int pos, int n, int open, int close) {
        char[] list = new char[100];

        if(close == n) {
            System.out.println(new String(list));
        }
        else {
            if (open > close) {
                list[pos] = '}';
                balancedParantheses(pos+1, n, open, close+1);
            }
            if(open < n) {
                list[pos] = '{';
                balancedParantheses(pos+1, n, open+1, close);
            }
        }

    }
}
