class Solution {
    public int findJudge(int N, int[][] trust) {
        Map<Integer, Integer> trusts = new HashMap<>();
        Map<Integer, Integer> trusted = new HashMap<>();
        int n = trust.length;
        if(N == 1) {
            return 1;
        }
        for(int i = 0; i < n; i++) {
            int x = trust[i][0];
            int y = trust[i][1];
            if(trusts.containsKey(x)) {
                trusts.put(x, trusts.get(x) + 1);
            } else {
                trusts.put(x, 1);
            }
            if(trusted.containsKey(y)) {
                trusted.put(y, trusted.get(y) + 1);
            } else {
                trusted.put(y, 1);
            }
        }
        for(int key : trusted.keySet()) {
            if(trusted.get(key) == N - 1 && !trusts.containsKey(key))
                return key;
        }
        return -1;
    }
}