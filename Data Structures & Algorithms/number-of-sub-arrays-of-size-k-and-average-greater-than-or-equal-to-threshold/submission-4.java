class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //input validation
        if (arr == null || arr.length == 0)
            return 0;
        //sorting to apply sliding window of fixed window k
        long windowSum = 0, thresholdSum = threshold * k; //(instead of dividing we can check window sum against thresholdSum)
        int subArraysResult = 0;
        //find sum of inital subarray of size k
        for (int index = 0; index < k; index++) {
            windowSum += arr[index];
        }
        //check if initial window satisfied threshold condition
        if (windowSum >= thresholdSum)
            subArraysResult++;
        //move window to the right and shrinking from teh left maintaining fixed window size of k
        for (int right = k; right < arr.length; right++) {
            windowSum += arr[right] - arr[right - k];
            if (windowSum >= thresholdSum)
                subArraysResult++;
        }
        return subArraysResult;
    }
}