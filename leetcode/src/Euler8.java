/**
 * Created by chandresh.pancholi on 18/07/16.
 * 23514624000
 */
public class Euler8 {
    public static void main(String[] args) {
        String digits = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        long largest = 0;
        long num ;
        System.out.println(digits.length());
        for(int i = 0; i < digits.length()-13; i++) {
            num =   (Integer.parseInt(digits.substring(i, i + 1)))
                    * (Integer.parseInt(digits.substring(i + 1, i + 2)))
                    * (Integer.parseInt(digits.substring(i + 2, i + 3)))
                    * (Integer.parseInt(digits.substring(i + 3, i + 4)))
                    * (Integer.parseInt(digits.substring(i + 4, i + 5)))
                    * (Integer.parseInt(digits.substring(i + 5, i + 6)))
                    * (Integer.parseInt(digits.substring(i + 6, i + 7)))
                    * (Integer.parseInt(digits.substring(i + 7, i + 8)))
                    * (Integer.parseInt(digits.substring(i + 8, i + 9)))
                    * (Integer.parseInt(digits.substring(i + 9, i + 10)))
                    * (Integer.parseInt(digits.substring(i + 10, i + 11)))
                    * (Integer.parseInt(digits.substring(i + 11, i + 12)))
                    * (Integer.parseInt(digits.substring(i + 12, i + 13)));
            System.out.println(num);
            if(num >= largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
