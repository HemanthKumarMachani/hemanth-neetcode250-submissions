class Solution {
    public String mergeAlternately(String word1, String word2) {
        // make sure input is valid
        if (word1 == null || word2 == null)
            return "";
        int w1L = word1.length(), w2L = word2.length(), w1Idx = 0, w2Idx = 0;
        StringBuilder merged = new StringBuilder();
        while (w1Idx < w1L && w2Idx < w2L) {
            merged.append(word1.charAt(w1Idx++));
            merged.append(word2.charAt(w2Idx++));
        }
        while (w1Idx < w1L) {
            merged.append(word1.charAt(w1Idx++));
        }
        while (w2Idx < w2L) {
            merged.append(word2.charAt(w2Idx++));
        }
        return merged.toString();
    }
}