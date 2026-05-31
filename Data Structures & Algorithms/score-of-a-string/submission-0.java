class Solution {
    public int scoreOfString(String s) {
        // make sure input is valid
        if (s == null)
            return 0;
        int sIdx = 0, score = 0;
        while (sIdx < s.length() - 1) {
            score += Math.abs(s.charAt(sIdx) - s.charAt(sIdx + 1));
            sIdx++;
        }
        return score;
    }
}