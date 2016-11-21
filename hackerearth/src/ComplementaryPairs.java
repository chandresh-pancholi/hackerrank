import java.util.HashMap;

public class ComplementaryPairs {
    public static void main(String[] args) {
        int[] input = {10, 4, 6, 1, 17, 9, 18, 0};
        int k = 18;
        getComplementry(input, k);

    }

    public static void getComplementry(int[] input, int k) {
        if (input.length == 1 || input.length == 0) {
            System.out.println("Complement not possible");
            return;
        }

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int diff = k - input[i];

            if (diff >= 0 && hm.get(diff) != null) {
                System.out.println(diff + " " + input[i]);
            }
            hm.put(input[i], true);
        }
    }

}
