class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // 1. Edge-case defense
        if (arr == null || arr.length < k) return 0;

        long runningSum = 0;
        // Calculate the target sum needed to avoid division inside the loop
        long targetSum = (long) threshold * k;
        int result = 0;

        // 2. Build the initial window of size k
        for (int i = 0; i < k; i++) {
            runningSum += arr[i];
        }

        // 3. Evaluate the first complete window
        if (runningSum >= targetSum) {
            result++;
        }

        // 4. Slide the window from index k to the end of the array
        for (int right = k; right < arr.length; right++) {
            // Add the incoming element on the right, remove the outgoing element on the left
            runningSum += arr[right] - arr[right - k];

            // Evaluate the freshly shifted window immediately
            if (runningSum >= targetSum) {
                result++;
            }
        }

        return result;
    }
}
