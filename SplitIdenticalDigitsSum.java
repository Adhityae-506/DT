// Input:
// A string S containing only digits.

// Output:
// The sum of integers formed by splitting S into groups of identical consecutive digits.

// Constraints:

// 1 ≤ |S| ≤ 100

// No digit repeats consecutively more than 15 times.

// Example:

// Input: 122311
// Output: 37
// Explanation: 1 + 22 + 3 + 11 = 37

// Input: 99995555666001234
// Output: 16230
// Explanation: 9999 + 5555 + 666 + 0 + 0 + 1 + 2 + 3 + 4


import java.util.Scanner;

public class SplitIdenticalDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long sum = 0;

        String current = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                sum += Long.parseLong(current);
                current = "" + s.charAt(i);
            }
        }

        sum += Long.parseLong(current);

        System.out.println(sum);
        sc.close();
    }
}
