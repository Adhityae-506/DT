// The program must accept two integers X and Y as the input. The program must find an operator from the four operators (*, -, +, /), 
// which returns the maximum value when the corresponding operation is performed between X and Y. If two or more operators give the 
// same maximum value, then the program must print the first occurring operator in the mentioned order.

// Note: The operator / indicates the integer division (i.e., It returns the quotient when X is divided by Y).

// Boundary Condition(s):
// -10^6 <= X, Y <= 10^6

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains a character representing the operator which gives the maximum value.

// Example Input/Output 1:
// Input:
// 4 9
// Output:
// *
// Explanation:
// Multiplication: 4 * 9 = 36
// Subtraction: 4 - 9 = -5
// Addition: 4 + 9 = 13
// Division: 4 / 9 = 0
// Here the multiplication gives the maximum value. Hence * is printed as the output.

// Example Input/Output 2:
// Input:
// 4 -10
// Output:
// Example Input/Output 3:
// Input:
// -10 5
// Output:
// /

// Example Input/Output 4:
// Input:
// 2 2
// Output:
// *



import java.util.Scanner;

public class MaxOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[] arr = new int[4];
        char[] op = {'*', '-', '+', '/'};

        arr[0] = X * Y;
        arr[1] = X - Y;
        arr[2] = X + Y;

        if (Y != 0) {
            arr[3] = X / Y;
        } else {
            arr[3] = Integer.MIN_VALUE;
        }

        int maxIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println(op[maxIndex]);
    }
}

