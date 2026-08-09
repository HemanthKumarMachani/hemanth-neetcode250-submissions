class Solution {
    public int singleNonDuplicate(int[] nums) {
        // input validation
        if (nums == null)
            return 0;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (nums[mid] != nums[mid ^ 1])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }
}