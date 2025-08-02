// Rising Sequence - Minimum Addition
// The program must accept N integers and an integer K as the input. The program must convert the given sequence of N integers into a rising sequence (i.e., a sequence of integers in strictly increasing order) by adding K to one or more elements, any number of times. The program must print the 
// minimum number of times the value K to be added to the sequence to make the rising sequence.

// Boundary Condition(s):
// 2 ≤ N ≤ 1000

// 1 ≤ Each integer value, K ≤ 10⁶

// Input Format:
// The first line contains N.

// The second line contains N integers separated by a space.

// The third line contains K.

// Output Format:
// The first line contains an integer representing the minimum number of times K is added to the sequence.

// Example Input/Output 1:

// Input:
// 4
// 2 6 6 5
// 2

// Output:
// 3

// Explanation:
// Here K = 2.  
// The rising sequence can be formed as 2, 6, 8 and 9 by adding the value K thrice.  
// 3rd integer → 6 + 2 = 8 (2 is added once)  
// 4th integer → 5 + 2 + 2 = 9 (2 is added twice)  
// Hence 3 is printed as the output.

// Example Input/Output 2:

// Input:
// 4
// 1 2 3 4
// 2

// Output:
// 0

import java.util.*;

public class RisingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        int count = 0;

        for(int i = 1; i < n; i++) {
            while(arr[i] <= arr[i - 1]) {
                arr[i] += k;
                count++;
            }
        }

        System.out.println(count);
    }
}
