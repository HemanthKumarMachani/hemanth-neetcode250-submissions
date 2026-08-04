class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0)
            return nums;
        int n = nums.length, currentWinMax = nums[0];
        int[] maxResult = new int[n - k + 1];
        // track max value in k
        for (int i = 0; i < k; i++) {
            if (nums[i] > currentWinMax)
                currentWinMax = nums[i];
        }
        // after k, we found the currentWindowMax for first position
        int maxResultIdx = 0;
        maxResult[maxResultIdx++] = currentWinMax;
        // Now we slide the window thorugh remaining elements of the array maintaining
        // fixed window size of k
        for (int i = k; i < n; i++) {
            int incoming = nums[i];
            int outgoing = nums[i - k];
            if (incoming >= currentWinMax) {
                currentWinMax = incoming;
                maxResult[maxResultIdx++] = currentWinMax;
                continue;
            } else if (outgoing == currentWinMax) {
                // calculate the max within the window
                int winMax = nums[i];
                int winStart = i - k + 1;
                while (winStart < i) {
                    winMax = Math.max(winMax, nums[winStart]);
                    winStart++;
                }
                currentWinMax = winMax;
                maxResult[maxResultIdx++] = currentWinMax;
            } else if (nums[i] < currentWinMax) {
                maxResult[maxResultIdx++] = currentWinMax;
            }
        }
        return maxResult;
    }
}
