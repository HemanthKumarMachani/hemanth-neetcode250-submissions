class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        int low = 1, high = x/2, result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid == x) {
                return mid;
            } else if((long) mid * mid > x){
                high = mid - 1;
            }else{
                low = mid + 1;
                result = mid;
            }
        }
        return result;
    }
}