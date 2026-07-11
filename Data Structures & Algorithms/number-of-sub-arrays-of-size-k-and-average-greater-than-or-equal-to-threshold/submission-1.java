class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if (arr == null || arr.length == 0)
            return 0;
        int currSum = 0, result = 0;
        long thresholdSum = (long) threshold * k;
        for (int initialWinIdx = 0; initialWinIdx < k; initialWinIdx++) {
            currSum += arr[initialWinIdx];
        }
        // check if initial window >= thresholdSum and add to the result accordingly
        if (currSum >= thresholdSum) {
            result++;
        }
        // move the window from k through remaning elements till arr.length
        for (int rightIdx = k; rightIdx < arr.length; rightIdx++) {
            currSum += arr[rightIdx] - arr[rightIdx - k];
            if (currSum >= thresholdSum) {
                result++;
            }
        }
        return result;
    }
}