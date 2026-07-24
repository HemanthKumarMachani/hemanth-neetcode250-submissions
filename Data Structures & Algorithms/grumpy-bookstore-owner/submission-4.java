class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //input validation
        if(customers == null || grumpy == null || customers.length != grumpy.length) return 0;
        int baseSatisfied = 0, unsatisfied = 0, maxExtraSatisfied = 0;
        for(int rightIdx = 0; rightIdx < customers.length; rightIdx++){
            if(grumpy[rightIdx] == 0){
                baseSatisfied += customers[rightIdx];
            }else{
                unsatisfied += customers[rightIdx];
            }
            if(rightIdx >= minutes){
                int leftIdx = rightIdx - minutes;
                if(grumpy[leftIdx] == 1) unsatisfied -= customers[leftIdx];
            }
            maxExtraSatisfied = Math.max(maxExtraSatisfied, unsatisfied);
        }
        return baseSatisfied + maxExtraSatisfied;
    }
}