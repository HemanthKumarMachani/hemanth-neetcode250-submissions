class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // input validation
        if (nums == null || nums.length == 0)
            return false;
        int leftIdx = 0, rightIdx = 0;
        Set<Integer> seenWin = new HashSet<>();
        while (rightIdx < nums.length) {
            if (rightIdx - leftIdx > k) {
                seenWin.remove(nums[leftIdx++]);
            }
            if (seenWin.contains(nums[rightIdx])) {
                return true;
            }
            seenWin.add(nums[rightIdx++]);
        }
        return false;
    }
}