class Solution {
    public int longestConsecutive(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return 0;
        int longestSequence = 1, currentMax = 1;
        if(nums.length == 1) return longestSequence;
        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index++){
            if(nums[index] == nums[index-1]+1){
                currentMax++;
            }else if(nums[index] == nums[index-1]){
                continue;
            }
            else{
                longestSequence = Math.max(longestSequence, currentMax);
                currentMax = 1;
            }
        }
        return Math.max(longestSequence,currentMax);
    }
}
