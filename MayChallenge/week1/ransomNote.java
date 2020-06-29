class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> ransomMap = new HashMap<>();
        Map<String, Integer> magMap = new HashMap<>();
        for(char el : ransomNote.toCharArray()) {
            if(ransomMap.containsKey(String.valueOf(el))) {
                ransomMap.put(String.valueOf(el), ransomMap.get(String.valueOf(el)) + 1);
            } else {
                ransomMap.put(String.valueOf(el), 1);
            }
        }
        for(char el : magazine.toCharArray()) {
            if(magMap.containsKey(String.valueOf(el))) {
                magMap.put(String.valueOf(el), magMap.get(String.valueOf(el)) + 1);
            } else {
                magMap.put(String.valueOf(el), 1);
            }
        }
        for(String key:ransomMap.keySet()) {
            if(!magMap.containsKey(key) || ransomMap.get(key) > magMap.get(key))
                return false;
        }
        return true;
    }
}