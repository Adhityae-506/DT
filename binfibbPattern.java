// The program must accept an integer N as the input. The program must print the Binary Fibonacci pattern of (2*N)-1 lines based on the following conditions:

// The first line contains 0.

// The second line contains 1.

// Each line from 3 to N contains the concatenation of previous two lines.

// The remaining N-1 lines contain the water image of the first N-1 lines.

// Boundary Condition(s):
// 3 ≤ N ≤ 20

// Input Format:
// The first line contains N.

// Output Format:
// The first (2*N)-1 lines contain the Binary Fibonacci pattern.

// Example Input/Output 1:
// Input:
// 6
// Output:
// 0
// 1
// 01
// 101
// 01101
// 10101101
// 01101
// 101
// 01
// 1
// 0

import java.util.*;
public class binfibbPattern{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] lines = new String[n];
        lines[0] = "0";
        lines[1] = "1";

        for (int i = 2; i < n; i++) {
            lines[i] = lines[i - 2] + lines[i - 1];
        }

        // Print first N lines
        for (int i = 0; i < n; i++) {
            System.out.println(lines[i]);
        }

        // Print water image (first N-1 lines in reverse order)
        for (int i = n - 2; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }
}

