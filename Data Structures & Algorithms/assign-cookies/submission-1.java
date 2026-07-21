class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (s == null || g == null)
            return 0;
        Arrays.sort(s);
        int result = 0;
        for (int greedIdx = 0; greedIdx < g.length; greedIdx++) {
            int minIdx = -1;
            for (int cookieIdx = 0; cookieIdx < s.length; cookieIdx++) {
                if (g[greedIdx] > s[cookieIdx])
                    continue;
                if (minIdx == -1 || s[minIdx] > s[cookieIdx]) {
                    minIdx = cookieIdx;
                }
            }
            if (minIdx != -1) {
                s[minIdx] = -1;
                result++;
            }
        }
        return result;
    }
}