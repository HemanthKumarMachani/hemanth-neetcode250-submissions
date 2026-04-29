class Solution {
    public void sortColors(int[] nums) {
        int [] colorFreq = new int [3];
        for(int num : nums) colorFreq[num]++;
        int index = 0;
        for(int color = 0; color < colorFreq.length; color++){
        int currentColorFreq = colorFreq[color];
        while(currentColorFreq > 0){
            nums[index++] = color;
            currentColorFreq--;
        }
        }
    }
}