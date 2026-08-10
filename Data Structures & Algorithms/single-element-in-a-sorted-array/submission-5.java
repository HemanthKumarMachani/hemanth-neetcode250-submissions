class Solution {
    public int singleNonDuplicate(int[] nums) {
        //input validation
        if(nums == null || nums.length == 0) return -1;
        int low = 0, high = nums.length - 1;
        //binary search on monotonic space nums to achevie TC: O(logN) and SC O(1)
        while(low < high){
            int mid = low + (high - low) / 2; //calcuate the mid
            if((mid & 1) == 1) mid--; //even index check
            if(nums[mid] != nums[mid+1]){ //check if both even and odd idx vals are same
                high = mid; // answer is towards left
            }else{
                low = mid + 2; // answer it towards rigth;
            }
        }
        return nums[low]; //return the num that appears once.
    }
}