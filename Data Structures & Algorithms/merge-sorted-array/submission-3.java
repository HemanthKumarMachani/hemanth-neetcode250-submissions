class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m -1;
        int nIndex = n-1;
        int rightIndex = m + n - 1;
        while(nIndex >= 0){
            if(mIndex >= 0 && nums1[mIndex] > nums2[nIndex]){
                nums1[rightIndex--] = nums1[mIndex--];
            }else{
                nums1[rightIndex--] = nums2[nIndex--];
            }
            //rightIndex--;
        }
        
    }
}