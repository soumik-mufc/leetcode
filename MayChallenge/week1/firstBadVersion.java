/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            return firstBadInRange(0, n);
        }
        public int firstBadInRange(int low, int high) {
             
            if(high == low) {
                return low;
            } else if(high - low == 1) {
                if(isBadVersion(low))
                    return low;
                else
                    return high;
                
            }
            int mid = low + (high - low) / 2;
            if(isBadVersion(mid+1) && !isBadVersion(mid))
                return mid+1;
            else if(isBadVersion(mid) && !isBadVersion(mid-1))
                return mid;
            else if(isBadVersion(mid-1))
                return firstBadInRange(low, mid);
            else 
                return firstBadInRange(mid+1, high);
        }
    }