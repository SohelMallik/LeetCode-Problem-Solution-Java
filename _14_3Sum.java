// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
 

// Constraints:

// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105

class Solution {

    public void twosum(int f, int[] nums, List<List<Integer>> res) {
        int i = f + 1;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[f] + nums[i] + nums[j];

            if (sum > 0) {
                j--;
            } 
            else if (sum < 0) {
                i++;
            } 
            else {
                res.add(Arrays.asList(nums[f], nums[i], nums[j]));

                i++;
                j--;

                // Skip duplicate left values
                while (i < j && nums[i] == nums[i - 1]) {
                    i++;
                }

                // Skip duplicate right values
                while (i < j && nums[j] == nums[j + 1]) {
                    j--;
                }
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int f = 0; f < nums.length - 2; f++) {

            // If fixed number is positive,
            // sum can never become 0 because array is sorted.
            if (nums[f] > 0) {
                break;
            }

            // Skip duplicate fixed values
            if (f == 0 || nums[f] != nums[f - 1]) {
                twosum(f, nums, res);
            }
        }

        return res;
    }
}