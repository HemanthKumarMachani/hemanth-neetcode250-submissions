class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // input validation
        if (piles == null || piles.length == 0)
            return 0;
        int low = 0, high = Arrays.stream(piles).max().getAsInt(), min_k = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(mid, piles, h)) {
                min_k = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return min_k;
    }

    public boolean canShip(int speed, int[] piles, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}
