/*  680. Valid Palindrome II
Solved
Easy
Topics
premium lock icon
Companies
Given a string s, return true if the s can be palindrome 
after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 

Constraints:

1 <= s.length <= 105
s co */


class Solution {
    // T: O(n)
    // S: O(1)
    public boolean palindromecheck(int i, int j, String s){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);

            if(left != right){
                return palindromecheck(i+1, j, s) || palindromecheck(i, j-1,s);

            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
