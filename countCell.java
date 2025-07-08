// Count Cells - Coordinates Value

// Description:
// The program must accept an integer matrix of size R*C as input. It must print the number of cells having the values equal to 
// the concatenation of the row and column coordinates in the matrix.

// Boundary Condition(s):

// 1 ≤ R, C ≤ 50

// 1 ≤ Matrix element value ≤ 9999

// Input Format:

// The first line contains R and C, separated by a space.

// The next R lines each contain C integers separated by spaces.

// Output Format:

// The first line prints an integer representing the number of cells matching the rule.

// Example Input/Output 1:
// Input:
// 5 5
// 34 21 32 41 25
// 14 42 43 24 31
// 54 45 33 34 23
// 33 15 51 31 35
// 21 52 53 13 55

// Output:
// 6

import java.util.Scanner;

public class countCell{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int row = i + 1;  
                int col = j + 1; 

        
                int concat = Integer.parseInt("" + row + col);

                if (matrix[i][j] == concat) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
