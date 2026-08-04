class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // input validation
        if (s1 == null || s2 == null || s1.length() > s2.length())
            return false;
        int N1 = s1.length();
        int N2 = s2.length();
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        for (int i = 0; i < N1; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Freq, s2Freq)) {
            return true;
        }
        // slide through remaining chars in s2 maintaining window size for N1
        // and check if premutaion exists
        for (int i = N1; i < N2; i++) {
            s2Freq[s2.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i - N1) - 'a']--;
            if (Arrays.equals(s1Freq, s2Freq))
                return true;
        }
        return false;
    }
}
