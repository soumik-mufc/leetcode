class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num / 2;
        if(num == 1)
            return true;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            long res = num / mid;
            long rem = num % mid;
            if(res == mid && rem == 0)
                return true;
            else if (mid * mid < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}