package zinka;

import java.util.Scanner;

class Partition {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalTestCase = sc.nextInt();

        for (int i = 0; i < totalTestCase; i++) {
            int totalNumber = sc.nextInt();
            int [] input = new int[totalNumber];
            for (int j = 1; j <= totalNumber; j++ ) {
                input[j-1] = j;
            }

            if (findPartition(input, totalNumber))
                System.out.println("YES");
            else
                System.out.println("NO");


        }
    }

    static boolean findPartition (int arr[], int n)
    {
        int sum = n * (n+1)/2;
        int i, j;

        if (sum%2 != 0)
            return false;

        boolean partitionTable[][]=new boolean[sum/2+1][n+1];

        for (i = 0; i <= n; i++)
            partitionTable[0][i] = true;

        for (i = 1; i <= sum/2; i++)
            partitionTable[i][0] = false;

        for (i = 1; i <= sum/2; i++)
        {
            for (j = 1; j <= n; j++)
            {
                partitionTable[i][j] = partitionTable[i][j-1];
                if (i >= arr[j-1])
                    partitionTable[i][j] = partitionTable[i][j] ||
                            partitionTable[i - arr[j-1]][j-1];
            }
        }

        return partitionTable[sum/2][n];
    }


}
