class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = low, high = nums.length - 1;
        while (mid <= high) {
            int color = nums[mid];
            if (color == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (color == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}