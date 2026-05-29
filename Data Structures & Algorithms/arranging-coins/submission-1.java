class Solution {
    public int arrangeCoins(int n) {
        int low = 1, high = n, result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long coins = (long) mid * (mid + 1) / 2;
            if (coins > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
                result = Math.max(result, mid);
            }
        }
        return result;
    }
}