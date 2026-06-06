class Solution {
    public int[] searchRange(int[] nums, int target) {
        // make sure input is valid
        if (nums == null || nums.length == 0)
            return new int[] {-1, -1};
        int[] result = new int[] {-1, -1};
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    public static int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1, firstPosition = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstPosition = mid;
                high = mid - 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return firstPosition;
    }
    public static int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1, lastPosition = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                lastPosition = mid;
                low = mid + 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return lastPosition;
    }
}