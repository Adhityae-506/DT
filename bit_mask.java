// The program must accept an integer N and a string S containing only uppercase alphabets as the input.
// The binary representation of N indicates the status of 26 uppercase alphabets (A to Z) based on the following conditions:

// The 26 bits (from LSB to MSB) map to the 26 uppercase letters A to Z.

// A 1 in the binary representation means the corresponding alphabet is allowed.

// A 0 in the binary representation means the corresponding alphabet is not allowed.

// The program must print YES if the string S is formed using only the alphabets indicated by 1 bits in the binary representation of N.
// Otherwise, it must print NO.

// Input:
// 10
// BDDB
// Output:
// YES

// Input:
// 44
// DECADE
// Output:
// NO


import java.util.*;

public class bit_mask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        for(int i=0;i<s.length();i++)
        {
            int pos = s.charAt(i) - 'A';
            if(((n>>pos)&1)==0)
            {
                System.out.println("NO");
                return;
            }


        }
        System.out.println("YES");
    }
}
