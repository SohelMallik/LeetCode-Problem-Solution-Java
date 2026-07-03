/*   Plus One
Solved
Easy
Topics
premium lock icon
Companies
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */

class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i= n-1; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits; //if return Loop Break;
            }else{
                digits[i]=0;
            }
        }
        int [] arr=new int[n+1];
        arr[0]=1;// Not Put i put 0
        return arr;

    }
}



/*  Yes, your code is correct. The line

arr[0] = 1;

is very important.

Why arr[0] = 1?

Consider:

digits = [9,9,9]

Loop execution:

[9,9,9]
↓
[9,9,0]
↓
[9,0,0]
↓
[0,0,0]

All digits become 0, and the loop ends.

Now we create:

int[] arr = new int[n + 1];

which is:

[0,0,0,0]

But:

999 + 1 = 1000

So we must put 1 at the first position:

arr[0] = 1;

Result:

[1,0,0,0]
What if you don't write arr[0] = 1?

Then:

int[] arr = new int[n + 1];
return arr;

returns:

[0,0,0,0]

which is wrong because:

999 + 1 ≠ 0000
999 + 1 = 1000 */