class Solution {
    public String mergeAlternately(String word1, String word2) {
        // make sure input is valid
        if (word1 == null || word2 == null)
            return "";
        int w1L = word1.length(), w2L = word2.length(), w1Idx = 0, w2Idx = 0;
        //StringBuilder merged = new StringBuilder();
        char [] merged = new char[w1L + w2L];
        int mergedIdx = 0;
        while (w1Idx < w1L && w2Idx < w2L) {
            merged[mergedIdx++] = word1.charAt(w1Idx++);
            merged[mergedIdx++] = word2.charAt(w2Idx++);
            //merged.append(word1.charAt(w1Idx++));
            //merged.append(word2.charAt(w2Idx++));
        }
        if (w1Idx < w1L) {
            System.arraycopy(word1.toCharArray(), w1Idx, merged, (w1Idx + w2Idx), w1L - w1Idx);
            // merged.append(word1.charAt(w1Idx++));
        }
        else if (w2Idx < w2L) {
            System.arraycopy(word2.toCharArray(), w2Idx, merged, (w1Idx + w2Idx), w2L - w2Idx);
            // merged.append(word2.charAt(w2Idx++));
        }
        return new String(merged);
    }
}