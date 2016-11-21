/* IMPORTANT: Multiple classes and nested static classes are supported */
package array;

import java.util.HashMap;
import java.util.Scanner;

class Testcase {
    public static void main(String args[] ) throws Exception {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] A = new int[n];
        while(count < n){
            A[count] = sc.nextInt();
            count++;
        }
        count = 0;
        int m = sc.nextInt();
        int [] B = new int[m];
        while(count < m) {
            B[count] = sc.nextInt();
            count++;
        }

        int[] C = merge(A,B);

        for(int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
    public static int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < C.length) {
            if( i < A.length && j < B.length) {

                if(A[i] > B[j]) {
                    C[k] = B[j];
                    k++;
                    j++;
                }
                else if(A[i] < B[j]) {
                    C[k] = A[i];
                    k++;
                    i++;
                } else {
                    C[k++] = A[i];
                    C[k] = B[j];
                    k++;
                    i++;
                    j++;
                }
            }
            else if(i == A.length) {
                C[k] = B[j];
                j++;
                k++;
            } else if(j == B.length) {
                C[k] = A[i];
                i++;
                j++;
            }
        }

        return C;
    }

}
