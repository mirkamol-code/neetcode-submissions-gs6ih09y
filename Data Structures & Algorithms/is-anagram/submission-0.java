class Solution {
    public boolean isAnagram(String s, String t) {
       char sChars[] = s.toCharArray();
       char tChars[] = t.toCharArray();
       Arrays.sort(sChars);
       Arrays.sort(tChars);
       String stext = Arrays.toString(sChars);
        String tText = Arrays.toString(tChars);
        return stext.equals(tText);
    }
}
