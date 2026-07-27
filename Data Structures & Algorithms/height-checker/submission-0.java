class Solution {
    public int heightChecker(int[] heights) {
        // input validation
        if (heights == null || heights.length == 0)
            return 0;
        int[] sorted = heights.clone();
        int notAsExpectedCount = 0;
        Arrays.sort(sorted);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                notAsExpectedCount++;
            }
        }
        return notAsExpectedCount;
    }
}