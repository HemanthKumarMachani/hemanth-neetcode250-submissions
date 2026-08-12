class Solution {
    public int search(int[] nums, int target) {
        // input validation
        if (nums == null || nums.length == 0)
            return -1;
        // as the input nums is monotonic space binary search on nums to find target
        //[-1,0,2,4,6,8], target = 4 // l= 0, h = 5
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
