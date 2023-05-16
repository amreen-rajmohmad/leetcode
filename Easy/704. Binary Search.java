class Solution {
    public int search(int[] nums, int target) {
        int indexLow = 0;
        int indexHigh = nums.length - 1;
        while(indexLow <= indexHigh) {
            if (nums[(indexHigh + indexLow) / 2] < target) {
                indexLow = (indexHigh + indexLow) / 2 + 1;
            } else if (nums[(indexHigh + indexLow) / 2] > target) {
                indexHigh = (indexHigh + indexLow) / 2 - 1;
            } else {
                return (indexHigh + indexLow) / 2 ;
            }
        }
        return -1;
    }
}

// https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i