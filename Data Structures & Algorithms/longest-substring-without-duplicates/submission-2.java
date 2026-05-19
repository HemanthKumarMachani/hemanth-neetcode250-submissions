class Solution {
    public int lengthOfLongestSubstring(String s) {
        //make sure input is valid
        if(s == null || s.length() == 0) return 0;
        int leftIdx = 0, longestSubString = 0;
        Map<Character, Integer> seenChars = new HashMap<>();
        for(int rightIdx = 0; rightIdx < s.length(); rightIdx++){
            char ch = s.charAt(rightIdx);
            if(seenChars.containsKey(ch) && seenChars.get(ch) >= leftIdx){
                leftIdx = seenChars.get(ch) + 1;
            }
            longestSubString = Math.max(longestSubString, rightIdx - leftIdx +1);
            seenChars.put(ch, rightIdx);
        }
        return longestSubString;
    }
}
