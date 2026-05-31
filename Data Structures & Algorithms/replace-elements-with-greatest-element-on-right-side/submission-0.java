class Solution {
    public int[] replaceElements(int[] arr) {
        // make sure input is valid
        if (arr == null || arr.length == 0)
            return arr;
        for (int outerIdx = 0; outerIdx < arr.length - 1; outerIdx++) {
            int max = 0;
            for (int innerIdx = outerIdx + 1; innerIdx < arr.length; innerIdx++) {
                max = Math.max(max, arr[innerIdx]);
            }
            arr[outerIdx] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}