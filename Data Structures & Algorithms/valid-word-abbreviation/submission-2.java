class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        // input validation
        if (word == null || abbr == null)
            return false;
        int wIdx = 0, aIdx = 0;
        while (wIdx < word.length() && aIdx < abbr.length()) {
            char wc = word.charAt(wIdx);
            char ac = abbr.charAt(aIdx);
            if (ac == '0')
                return false;
            if (aIdx < abbr.length() && Character.isLetter(ac)) {
                if (wIdx < word.length() && ac == wc) {
                    wIdx++;
                    aIdx++;
                } else {
                    return false;
                }
            } else {
                int subLen = 0;
                while (aIdx < abbr.length() && Character.isDigit(abbr.charAt(aIdx))) {
                    subLen = subLen * 10 + (abbr.charAt(aIdx) - '0');
                    aIdx++;
                }
                wIdx += subLen;
            }
        }
        return wIdx == word.length() && aIdx == abbr.length();
    }
}