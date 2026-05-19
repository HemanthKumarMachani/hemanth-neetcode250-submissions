class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, maxFreq = 0, maxLen = 0;
        int [] freqCount = new int [26];
        for(int right = 0; right < s.length(); right++){
            //add the current characater to the windo
            int ch = s.charAt(right)-'A';
            //increment the frequency of the character
            freqCount[ch]++;
            //Track the max frequency of the character in the window
            maxFreq = Math.max(maxFreq, freqCount[ch]);
            int window = right - left +1;

            //if window - maxFreq > k then replacement is needed
            //we should move the left point
            if(window - maxFreq > k){
                freqCount[s.charAt(left)- 'A']--;
                left++;
            }
            //window is always either same size or growing
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}
