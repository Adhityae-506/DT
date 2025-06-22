// The program must accept a string S representing a boolean expression. The string S contains T, F, &, | and ^.

// T – True

// F – False

// & – Bitwise AND Operator

// | – Bitwise OR Operator

// ^ – Bitwise XOR Operator

// The program must evaluate the given expression from left to right and print the result as the output (ignoring traditional operator precedence).

// 📌 Boundary Condition(s):
// 3 <= Length of S <= 99
// 📥 Input Format:
// The first line contains the string S.
// 📤 Output Format:
// The first line contains the result for the given boolean expression.
// 🧪 Example Input/Output 1:
// Input:
// T|F^T|T&F
// Output:
// F
// Explanation:
// T | F = T  
// T ^ T = F  
// F | T = T  
// T & F = F  
// 🧪 Example Input/Output 2:
// Input:
// T|F&T^T
// Output:
// T
// Explanation:
// T | F = T  
// T & T = T  
// T ^ T = F  



import java.util.*;

public class evl_bool_exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Initialize with first value
        char result = s.charAt(0);

        for (int i = 1; i < s.length(); i += 2) {
            char operator = s.charAt(i);
            char nextVal = s.charAt(i + 1);

            switch (operator) {
                case '&':
                    result = (result == 'T' && nextVal == 'T') ? 'T' : 'F';
                    break;
                case '|':
                    result = (result == 'T' || nextVal == 'T') ? 'T' : 'F';
                    break;
                case '^':
                    result = (result != nextVal) ? 'T' : 'F';
                    break;
            }
        }

        System.out.print(result);
    }
}
