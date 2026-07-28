class Solution {
    public int maxArea(int[] heights) {
        // input validation
        if (heights == null || heights.length == 0)
            return 0;
        int left = 0, right = heights.length - 1, maxWaterArea = 0;
        while (left < right) {
            int currentArea = Math.min(heights[left], heights[right]) * (right - left);
            maxWaterArea = Math.max(maxWaterArea, currentArea);
            if (heights[left] <= heights[right])
                left++;
            else
                right--;
        }
        return maxWaterArea;
    }
}
