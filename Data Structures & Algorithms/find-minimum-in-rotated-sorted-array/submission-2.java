class Solution {
    public int findMin(int[] nums) {
        // make sure input is valid
        if (nums == null || nums.length == 0)
            return 0;
        int minValue = nums[0], low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
