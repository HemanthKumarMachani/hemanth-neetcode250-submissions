class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];     // frequency of each char in current window
        int maxFreq = 0;              // highest frequency seen in any valid window
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            // Expand window by including s[right]
            int c = s.charAt(right) - 'A';
            freq[c]++;
            // Track the max frequency character in the window
            maxFreq = Math.max(maxFreq, freq[c]);

            int windowLen = right - left + 1;

            // Replacements needed = windowLen - maxFreq
            // If > k, window is invalid — slide left by 1
            if (windowLen - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Window is always either same size or growing
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}