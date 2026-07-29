class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // input validation
        if (s1 == null || s2 == null)
            return false;
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);
        int N = sortedS1.length();
        for (int outer = 0; outer < s2.length(); outer++) {
            for (int inner = outer + N - 1; inner < s2.length(); inner++) {
                char[] subStr = s2.substring(outer, inner + 1).toCharArray();
                Arrays.sort(subStr);
                String sortedSubS2 = new String(subStr);
                if (sortedSubS2.equals(sortedS1))
                    return true;
            }
        }
        return false;
    }
}
