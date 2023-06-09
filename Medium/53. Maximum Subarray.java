// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSubarray = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             int currentSubarray = 0;
//             for (int j = i; j < nums.length; j++) {
//                 currentSubarray += nums[j];
//                 maxSubarray = Math.max(maxSubarray, currentSubarray);
//             }
//         }
        
//         return maxSubarray;
//     }
// }


class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        
        // Start with the 2nd element since we already used the first one.
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        
        return maxSubarray;
    }
}


// https://leetcode.com/problems/maximum-subarray/submissions/951371890/?envType=study-plan&id=data-structure-i
// https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm