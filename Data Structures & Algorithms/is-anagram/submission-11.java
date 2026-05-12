class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        HashMap<Character, Integer> sCountMap = new HashMap<>();
        HashMap<Character, Integer> tCountMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
         sCountMap.put(sChars[i], sCountMap.getOrDefault(sChars[i], 0) + 1);
        tCountMap.put(tChars[i], tCountMap.getOrDefault(tChars[i], 0) + 1);
        }
        return sCountMap.equals(tCountMap);
    }
}
