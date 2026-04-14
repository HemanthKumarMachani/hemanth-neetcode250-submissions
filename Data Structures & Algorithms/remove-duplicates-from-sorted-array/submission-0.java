class Solution {
    public int removeDuplicates(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int uniquesIndex = 1;
        for(int index = 1; index < nums.length; index++){
            if(nums[index] > nums[index-1]){
                nums[uniquesIndex++] = nums[index];
            }
        }
        return uniquesIndex;
    }
}