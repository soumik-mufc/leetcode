class Solution {
    public int singleNonDuplicate(int[] nums) {
        int a = 0;
        for(int el : nums) {
            a ^= el;
        }
        return a;
    }
}