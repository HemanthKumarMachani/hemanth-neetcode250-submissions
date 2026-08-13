class Solution {
    public int mySqrt(int x) {
        //input validation
        if(x == 0) return 0;
        if(x == 1) return 1;
        int low = 0, high = x;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if(square > x) high = mid - 1;
            else if(square == x) return mid;
            else low = mid + 1;
        }
        return high;
    }
}