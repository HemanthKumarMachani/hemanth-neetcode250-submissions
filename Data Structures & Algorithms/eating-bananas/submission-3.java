class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //make sure input is valid
        if (piles == null || piles.length == 0 || h == 0)
            return 0;
        int low = 0, high = Arrays.stream(piles).max().getAsInt(), result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, h, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static boolean canFinish(int[] piles, int h, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}