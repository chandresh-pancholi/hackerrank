/**
 * Created by chandresh.pancholi on 23/07/16.
 */

import java.util.ArrayList;
import java.util.List;

/**
 Given k - which is the number of bits, print all the possible combinations of numbers formed by printing all numbers with one bit set,
 followed by two bits set, ... upto the point when all k-bits are set. They must be sorted according to the number of bits set,
 if two numbers have the same number of bits set then they should be placed as per their value.

 For example if K=3
 Output:
 000, 001, 010, 100,101, 110, 011, 111
 0 bits set, followed by 1 bits set followed by 2 bits set followed by 3 bits set.

 **/
public class BitPermutation {
    public static void main(String[] args) {
        BitPermutation b = new BitPermutation();
        b.generateBit(3);
    }

    public void generateBit(int k) {
        for (int i = 0; i <= k; i++) {
            generateBitSet(k, i, "");
        }
    }

    public void generateBitSet(int size, int d, String suffix) {
        if (d < 0) {
            return;
        }
        if (size <= 0) {
            System.out.println(suffix);
        } else if (size == d) {
            generateBitSet(size - 1, d - 1, "1" + suffix);
        } else {
            generateBitSet(size - 1, d - 1, "1" + suffix);
            generateBitSet(size - 1, d, "0" + suffix);
        }
    }
}
