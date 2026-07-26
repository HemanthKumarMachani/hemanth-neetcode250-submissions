class Solution {
    public boolean isIsomorphic(String s, String t) {
        // input validation
        if (s == null || t == null || s.length() != t.length())
            return false;
        Map<Character, Character> st_map = new HashMap<>();
        Map<Character, Character> ts_map = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            char sChar = s.charAt(index);
            char tChar = t.charAt(index);
            if ((st_map.containsKey(sChar) && st_map.get(sChar) != tChar)
                || (ts_map.containsKey(tChar) && ts_map.get(tChar) != sChar))
                return false;
            st_map.put(sChar, tChar);
            ts_map.put(tChar, sChar);
        }
        return true;
    }
}