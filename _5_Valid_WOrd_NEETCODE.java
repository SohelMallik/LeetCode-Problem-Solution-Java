class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        int i = 0, j = 0;

        while (i < word.length() && j < abbr.length()) {

            char wc = word.charAt(i);
            char ac = abbr.charAt(j);

            // Jodo  Digit then Executed
            if (Character.isDigit(ac)) {

                // Leading zero is not allowed
                if (ac == '0') {
                    return false;
                }

                int curr = 0;

                while (j < abbr.length() &&
                       Character.isDigit(abbr.charAt(j))) {

                    curr = curr * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i = i + curr; //Skip Characters in Word

            } else {

                // Characters must match
                if (wc != ac) {
                    return false;
                }

                i++;
                j++;
            }
        }

        return i == word.length() && j == abbr.length();
    }
}


// Excellent question.

// num = num * 10 + (abbr.charAt(j) - '0');

// '0' is used to convert a digit character into its integer value.

// Characters are stored as ASCII/Unicode values
// Character	ASCII Value
// '0'	48
// '1'	49
// '2'	50
// '3'	51
// '4'	52
// '5'	53
// '6'	54
// '7'	55
// '8'	56
// '9'	57

// Suppose:

// char ch = '7';

// Internally:

// '7' = 55
// '0' = 48

// So:

// ch - '0'

// becomes:

// 55 - 48 = 7

// Result:

// 7
// Example 1
// char ch = '5';

// int num = ch - '0';

// Calculation:

// 53 - 48 = 5



// return i == word.length() &&(WHY USED)
//        j == abbr.length();
// Meaning
// i == word.length()
// Pointer i has reached the end of word.
// j == abbr.length()
// Pointer j has reached the end of abbr.
// &&
// Both conditions must be true.

// So:

// return (i reached end of word) AND (j reached end of abbr);