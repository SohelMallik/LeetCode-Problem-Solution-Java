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
