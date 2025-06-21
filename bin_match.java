// The program must accept an integer X and N integers as input. The given N integer values are always less than or equal to X. The program must print the number of integers whose binary representations match the binary representation of X from the LSB (least significant bit).

// Boundary Conditions:
// 1 <= N <= 100

// 1 <= Each integer value <= 2^31


// The first line contains X and N separated by a space.

// The second line contains N integer values separated by a space.


// The first line contains the number of integers whose binary representations match the binary representation of X from the LSB.

// Example Input/Output 1:
// Input:
// 105 5
// 41 10 9 13 1
// Output:

// 3

import java.util.*;

public class bin_match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        String xBin = Integer.toBinaryString(X);
        int count = 0;

        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            String valBin = Integer.toBinaryString(val);
            if (xBin.endsWith(valBin)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
