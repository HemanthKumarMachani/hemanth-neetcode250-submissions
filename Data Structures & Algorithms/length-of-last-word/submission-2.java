class Solution {
    public int lengthOfLastWord(String s) {
        // Safe input validation
        if (s == null || s.length() == 0)
            return 0;
        int sIdx = s.length() - 1;
        int lastWordLen = 0;
        // Step 1: Skip trailing spaces from the end
        while (sIdx >= 0 && s.charAt(sIdx) == ' ') {
            sIdx--;
        }
        // Step 2: Count characters of the last word until a space is hit
        while (sIdx >= 0 && s.charAt(sIdx) != ' ') {
            lastWordLen++;
            sIdx--;
        }

        return lastWordLen;
    }
}
