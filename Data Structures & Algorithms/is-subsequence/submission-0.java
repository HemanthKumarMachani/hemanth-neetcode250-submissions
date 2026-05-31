class Solution {
    public boolean isSubsequence(String s, String t) {
        // make sure input is valid
        if (s == null || t == null)
            return false;
        int sIdx = 0, tIdx = 0;
        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx))
                sIdx++;
            tIdx++;
        }
        return sIdx == s.length();
    }
}