class Solution {
    public int removeElement(int[] nums, int val) {
        int removedIdx = 0;
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != val){
                nums[removedIdx++] = nums[index];
            }
        }
        return removedIdx;
    }
}