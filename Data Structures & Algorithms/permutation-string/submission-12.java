class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //input validation
        if (s1 == null || s2 == null || s1.length() > s2.length())
            return false;
        int N1 = s1.length();
        int N2 = s2.length();
        //as the input contains only lowercase alphabets, create arr of size 26 to calculate freq of chars
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        //store the freq of s1 and s2 till N1
        for (int index = 0; index < N1; index++) {
            s1Freq[s1.charAt(index) - 'a']++;
            s2Freq[s2.charAt(index) - 'a']++;
        }
        if (Arrays.equals(s1Freq, s2Freq))
            return true;
        //slide through the remaining chars in s2 by maintaing fixed window size of N1
        for (int index = N1; index < N2; index++) {
            s2Freq[s2.charAt(index) - 'a']++;
            s2Freq[s2.charAt(index - N1) - 'a']--;
            if (Arrays.equals(s1Freq, s2Freq))
                return true;
        }
        return false;
    }
}