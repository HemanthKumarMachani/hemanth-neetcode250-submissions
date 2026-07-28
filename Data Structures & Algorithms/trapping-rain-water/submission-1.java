class Solution {
    public int trap(int[] height) {
        // input validation
        if (height == null || height.length == 0)
            return 0;
        int maxWaterArea = 0, N = height.length;
        // Compute Prefix Sum array to store leftMax at each index and fetch in O(1)
        int[] leftMaxPf = new int[N];
        leftMaxPf[0] = height[0];
        for (int i = 1; i < N; i++) {
            leftMaxPf[i] = Math.max(leftMaxPf[i - 1], height[i]);
        }
        // Compute Suffix Sum array to store rigthMax at each index and fetch in O(1)
        int[] rightMaxSf = new int[N];
        rightMaxSf[N - 1] = height[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            rightMaxSf[i] = Math.max(rightMaxSf[i + 1], height[i]);
        }
        for (int index = 0; index < N; index++) {
            // int leftMax = height[index];
            // int rightMax = height[index];
            //  for (int l = 0; l < index; l++) {
            //      leftMax = Math.max(leftMax, height[l]);
            //  }
            //  for (int r = index + 1; r < N; r++) {
            //      rightMax = Math.max(rightMax, height[r]);
            //  }
            maxWaterArea += Math.min(leftMaxPf[index], rightMaxSf[index]) - height[index];
        }
        return maxWaterArea;
    }
}
