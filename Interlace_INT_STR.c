/*function interlaceIntegerAndCharacter

The function/method interlaceIntegerAndCharacter accepts three arguments - N, arr and str. The integer N represents the size of the integer array arr and the character array str.

The function/method interlaceIntegerAndCharacter must form a string by interlacing the N integers with N characters and return the resulting string.

Your task is to implement the function interlaceIntegerAndCharacter so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):
1 <= N <= 100

1 <= Each integer value < 10^9

Example Input/Output 1:
Input:
5
12 45 789 32144 15
abcde

Output:
12a45b789c32144d15e

Explanation:
Here N = 5.
The given 5 integers are 12, 45, 789, 32144 and 15.
The given 5 characters are a, b, c, d and e.
After interlacing the 5 integers with the 5 characters, the interlaced string becomes:
12a45b789c32144d15e

Example Input/Output 2:
Input:
4
159 9004 5 20
WXYZ

Output:
159W9004X5Y20Z


___________________________________________________________________________________________________________________________________________________*/
char* interlaceIntegerAndCharacter(int N, int *arr, char *str) {
    static char result[10000];
    int pos = 0;
    
    for (int i = 0; i < N; i++) {
        pos += sprintf(result + pos, "%d%c", arr[i], str[i]);
    }
    
    return result;
}



