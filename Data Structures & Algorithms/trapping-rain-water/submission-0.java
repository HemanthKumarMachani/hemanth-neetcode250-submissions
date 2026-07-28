class Solution {
    public int trap(int[] height) {
        // input validation
        if (height == null || height.length == 0)
            return 0;
        int maxWaterArea = 0;
        for (int index = 0; index < height.length; index++) {
            int leftMax = height[index];
            int rightMax = height[index];
            for (int l = 0; l < index; l++) {
                leftMax = Math.max(leftMax, height[l]);
            }
            for (int r = index + 1; r < height.length; r++) {
                rightMax = Math.max(rightMax, height[r]);
            }
            maxWaterArea += Math.min(leftMax, rightMax) - height[index];
        }
        return maxWaterArea;
    }
}
