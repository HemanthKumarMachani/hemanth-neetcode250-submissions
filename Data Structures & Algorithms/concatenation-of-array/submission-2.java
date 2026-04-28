class Solution {
    public int[] getConcatenation(int[] nums) {
        //make user input is valid
        if(nums == null || nums.length == 0) return new int [0];
        int n = nums.length;
        int [] concatenatedResult = new int [n*2];
        for(int index = 0; index < n; index++){
            concatenatedResult[index] = nums[index];
            concatenatedResult[n + index] = nums[index];
        }
        return concatenatedResult;
    }
}