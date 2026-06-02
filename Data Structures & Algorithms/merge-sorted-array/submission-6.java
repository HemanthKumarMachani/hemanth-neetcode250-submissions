class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIdx = m - 1, nIdx = n - 1, rightIdx = m + n - 1;
        while (nIdx >= 0) {
            if (mIdx >= 0 && nums1[mIdx] > nums2[nIdx]) {
                nums1[rightIdx--] = nums1[mIdx--];
            } else {
                nums1[rightIdx--] = nums2[nIdx--];
            }
        }
    }
}