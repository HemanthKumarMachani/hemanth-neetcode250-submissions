class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // input validation
        if (nums == null || nums.length == 0 || k == 0)
            return false;
        
        int leftIdx = 0, rightIdx = 0; //{5,6,1,5}. // K = 3 & K = 4
        Set<Integer> seenWindow = new HashSet<>();
        while (rightIdx < nums.length) {
            if (rightIdx - leftIdx > k) {
                seenWindow.remove(nums[leftIdx]);
                leftIdx++;
            }
            if (seenWindow.contains(nums[rightIdx]))
                return true;
            seenWindow.add(nums[rightIdx]);
            rightIdx++;
        }
        return false;
    }
}