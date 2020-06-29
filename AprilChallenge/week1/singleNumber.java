class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int elem : nums) {
            // System.out.println(elem);
            ans = ans ^ elem;
            // System.out.println(ans);

        }
        return ans;
    }
}