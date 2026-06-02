class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        // make sure input is valid
        if (word == null || abbr == null)
            return false;
        int wIdx = 0, aIdx = 0, wLen = word.length(), aLen = abbr.length();
        while (wIdx < wLen && aIdx < aLen) {
            if (abbr.charAt(aIdx) == '0')
                return false;
            if (Character.isLetter(abbr.charAt(aIdx))) {
                if (wIdx < wLen && word.charAt(wIdx) == abbr.charAt(aIdx)) {
                    wIdx++;
                    aIdx++;
                } else {
                    return false;
                }
            } else {
                int subLen = 0;
                while (aIdx < aLen && Character.isDigit(abbr.charAt(aIdx))) {
                    subLen = subLen * 10 + (abbr.charAt(aIdx) - '0');
                    aIdx++;
                }
                wIdx += subLen;
            }
        }
        return wIdx == wLen && aIdx == aLen;
    }
}