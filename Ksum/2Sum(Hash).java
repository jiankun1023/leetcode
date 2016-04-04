public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int len = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < len; ++i) {
            if (hashmap.containsKey(target - nums[i])) {
                ans[0] = hashmap.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            hashmap.put(nums[i], i);
        }
        
        return null;
    }
}