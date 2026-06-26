class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Idx = 0, w2Idx = 0, w1Len = word1.length(), w2Len = word2.length();
        StringBuilder builder = new StringBuilder();
        // appending both Strings alternatively
        while (w1Idx < w1Len && w2Idx < w2Len) {
            builder.append(word1.charAt(w1Idx++));
            builder.append(word2.charAt(w2Idx++));
        }
        // appending any remaining chars left from word1, while words2 is lessthan word1
        while (w1Idx < w1Len) {
            builder.append(word1.charAt(w1Idx++));
        }
        // appending any remaining chars left from word2, while word1 is lessthan word2
        while (w2Idx < w2Len) {
            builder.append(word2.charAt(w2Idx++));
        }
        return builder.toString();
    }
}