class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // To store character frequencies
        int left = 0, maxFreq = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // 1. Add current character to window
            counts[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, counts[s.charAt(right) - 'A']);

            // 2. Check if window is valid: (Total chars - most frequent char) > k
            while ((right - left + 1) - maxFreq > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }

            // 3. Update result
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
