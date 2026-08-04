class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0)
            return new int[0]; // Fix: return empty array if input is empty
            
        int n = nums.length;
        int[] maxResult = new int[n - k + 1];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // 1. Populate the first window
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }
        
        int maxResultIdx = 0;
        maxResult[maxResultIdx++] = maxHeap.peek();
        
        // 2. Slide the window
        for (int i = k; i < n; i++) {
            maxHeap.add(nums[i]);        // Add the incoming element
            maxHeap.remove(nums[i - k]); // Remove the outgoing element
            maxResult[maxResultIdx++] = maxHeap.peek(); // Top is always the current max
        }
        return maxResult;
    }
}
