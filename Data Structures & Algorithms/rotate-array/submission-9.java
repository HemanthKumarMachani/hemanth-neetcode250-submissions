class Solution {
    public void rotate(int[] nums, int k) {
        int N = nums.length;
        k = k % N;
        reverse(nums, 0, N - 1); //{8,7,6,5,4,3,2,1}
        reverse(nums, 0, k - 1); //{5,6,7,8,4,3,2,1}
        reverse(nums, k, N - 1); //{5,6,7,8,1,2,3,4}
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}