class Solution {
    public int arrangeCoins(int n) {
        if (n <= 3) {
            return (n == 1) ? 1 : n - 1;
        }
        int low = 0, high = (n / 2) + 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            long coins = (long) mid * (mid + 1) / 2;
            if (coins > n) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low - 1;
    }
}