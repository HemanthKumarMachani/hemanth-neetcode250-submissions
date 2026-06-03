class Solution {
    public int singleNonDuplicate(int[] nums) {
        int target = 0;
        for(int num : nums){
            target ^= num;
        }
        return target;
    }
}