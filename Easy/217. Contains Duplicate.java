class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer, Boolean> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i])) {
        //         return true;
        //     } else {
        //         map.put(nums[i], true);
        //     }
        // }
        // return false;

		 Set<Integer> set = new HashSet<Integer>();
		 for(int i : nums)
			 if(!set.add(i))// if there is same
				 return true; 
		 return false;

        // using set instead of hashmap improves the performance 
    }
}

https://leetcode.com/problems/contains-duplicate/description/?envType=study-plan&id=data-structure-i