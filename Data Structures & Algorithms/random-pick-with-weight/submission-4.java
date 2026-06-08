class Solution {
    private int[] prefix;
    public Solution(int[] w) {
        prefix = new int[w.length + 1];
        for (int i = 0; i < w.length; i++) {
            prefix[i + 1] = prefix[i] + w[i];
        }
    }

    public int pickIndex() {
        double target = prefix[prefix.length - 1] * Math.random();
        int low = 1, high = prefix.length;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (prefix[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low - 1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */