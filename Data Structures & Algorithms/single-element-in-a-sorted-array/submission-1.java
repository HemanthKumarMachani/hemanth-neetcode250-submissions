class Solution {
    public int singleNonDuplicate(int[] nums) {
        // input validation
        if (nums == null)
            return 0;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if ((mid & 1) == 1)
                mid--;
            if (nums[mid] != nums[mid + 1])
                high = mid;
            else
                low = mid + 2;
        }
        return nums[low];
    }
}