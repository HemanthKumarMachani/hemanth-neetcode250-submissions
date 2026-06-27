class Solution {
    public int maxArea(int[] heights) {
        //input validation
        if(heights == null || heights.length ==0) return 0;
        int maxWaterArea = 0, left = 0, right = heights.length - 1;
        while(left < right){
            int area = Math.min(heights[left],heights[right]) * (right - left);
            maxWaterArea = Math.max(maxWaterArea, area);
            if(heights[left] >= heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxWaterArea;
    }
}
