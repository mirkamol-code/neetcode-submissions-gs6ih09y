class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
       
        HashMap<Character, Integer> sCountMap = new HashMap<>();
        HashMap<Character, Integer> tCountMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
         sCountMap.put(s.charAt(i), sCountMap.getOrDefault(s.charAt(i), 0) + 1);
        tCountMap.put(t.charAt(i), tCountMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sCountMap.equals(tCountMap);
    }
}
