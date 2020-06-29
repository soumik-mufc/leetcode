class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(count == 0) {
                ans = nums[i];
            }
            count += nums[i] == ans ? 1 : -1;
        }
        return ans;
    }
}