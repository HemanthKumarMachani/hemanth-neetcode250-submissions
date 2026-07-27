class Solution {
    public int maxDifference(String s) {
        //input validation
        if (s == null || s.length() == 0)
            return 0;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int minOdd = 101, maxOddIdx = 0, minEvenIdx = 101, maxEven = 0;
        for (int index = 0; index < freq.length; index++) {
            int f = freq[index];
            if ((f & 1) == 0 && f > 0) {
                minEvenIdx = Math.min(minEvenIdx, f);
                //maxEven = Math.max(maxEven, f);
            } else {
                //minOdd = Math.min(minOdd, f);
                maxOddIdx = Math.max(maxOddIdx, f);
            }
        }
        return maxOddIdx - minEvenIdx;
    }
}