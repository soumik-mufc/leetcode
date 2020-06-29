class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        boolean isSlopeInfinity = false;
        double slope = 0;
        if((coordinates[1][0] - coordinates[0][0]) == 0) {
            isSlopeInfinity = true;
        } else {
            slope = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        }
        for(int i = 2; i < n; i++) {
            boolean isNowSlopeInfinity = (coordinates[i][0] - coordinates[i-1][0]) == 0 ? true : false;
            if(isNowSlopeInfinity != isSlopeInfinity)
                return false;
            if(isNowSlopeInfinity == false) {
                double slope2 = (double)(coordinates[i][1] - coordinates[i-1][1]) / (coordinates[i][0] - coordinates[i-1][0]);
                // System.out.println(String.valueOf(slope) + " : " + String.valueOf(slope2));

                if(slope2 != slope)
                    return false;
            }
        }
        // System.out.println(i);
        return true;
    }
}