class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<String> set = new HashSet<>();
        for(char el : J.toCharArray()) {
            set.add(String.valueOf(el));
        }
        int count = 0;
        for(char s : S.toCharArray()) {
            if(set.contains(String.valueOf(s)))
                count++;
        }
        return count;
    }
}