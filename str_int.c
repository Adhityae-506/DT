// The function/method stringToInteger accepts an argument str representing a string value. The string contains the digits in words (only in lowercase).

// The function/method stringToInteger must find the integer value from the given string and return the integer value.

// Your task: Implement the function stringToInteger so that the program runs successfully.

// IMPORTANT: Do not write the main() function as it is already defined.

// Example Input/Output 1:

// Input:
// nineninefoursixseventwoone
// Output:
// 9946721
// Explanation:

// rust
// Copy
// Edit
// nine  -> 9
// nine  -> 9
// four  -> 4
// six   -> 6
// seven -> 7
// two   -> 2
// one   -> 1
// Hence the integer value is 9946721
// Example Input/Output 2:

// Input:
// onefiveeightfivethreeeightzero
// Output:
// 1585380

#include <stdio.h>
#include <string.h>

int stringToInteger(char *str) {
    char *digitwords[] = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };
    int num = 0;
    int i = 0;

    while (i < strlen(str)) {
        for (int j = 0; j < 10; j++) {
            int len = strlen(digitwords[j]);
            if (strncmp(&str[i], digitwords[j], len) == 0) {
                num = num * 10 + j;  
                i += len;            
                break;
            }
        }
    }
    return num;
}
