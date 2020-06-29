class Solution {
    public int findComplement(int num) {
        int res = num;
        int mask = 1;
        while(num > 0) {
            res = res ^ mask;
            mask = mask << 1;
            num = num >> 1;
        }
        return res;
    }
}