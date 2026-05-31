class Solution {
    public int[] replaceElements(int[] arr) {
        // make sure input is valid
        if (arr == null || arr.length == 0)
            return arr;
        int rightMax = -1;
        for (int index = arr.length - 1; index >= 0; index--) {
            int current = arr[index];
            arr[index] = rightMax;
            rightMax = Math.max(rightMax, current);
        }
        return arr;
    }
}