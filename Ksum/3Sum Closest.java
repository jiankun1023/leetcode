public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        
        int len = nums.length;
        int closest = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for (int i = 0; i < len - 2; ++i) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    int rst = target - sum;
                    if (rst < closest) {
                        closest = rst;
                        ans = sum;
                    }
                    left++;
                } else if (sum > target) {
                    int rst = sum - target;
                    if (rst < closest) {
                        closest = rst;
                        ans = sum;
                    }
                    right--;
                }
            }
        }
        
        return ans;
    }
}