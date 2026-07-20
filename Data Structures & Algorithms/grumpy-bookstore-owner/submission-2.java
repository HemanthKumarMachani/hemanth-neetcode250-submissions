class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //input validation
        if (customers == null || grumpy == null || customers.length == 0)
            return 0;
        int baseSatisfied = 0, unsatisfied = 0, maxWinExtraSatisfied = 0;
        for (int right = 0; right < customers.length; right++) {
            if (grumpy[right] == 0) {
                //add to base satisfied customers
                baseSatisfied += customers[right];
            } else {
                //add to current window potential extra satisfied customers
                unsatisfied += customers[right];
            }
            //maintain fixed window, when the window exceeds given minutes, remove the unsatisfied customers when grumpy
            if (right >= minutes) {
                int leftIdx = right - minutes;
                if (grumpy[leftIdx] == 1) {
                    unsatisfied -= customers[leftIdx];
                }
            }
            //keep track of potential extra satisfied customers 
            maxWinExtraSatisfied = Math.max(maxWinExtraSatisfied, unsatisfied);
        }
        return baseSatisfied + maxWinExtraSatisfied;
    }
}