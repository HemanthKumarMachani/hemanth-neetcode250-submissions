class Solution {
    public int arrangeCoins(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long coins = (long) mid * (mid + 1) / 2;
            if(coins == n) return mid;
            else if(coins < n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }
}