class Solution {
    public int totalFruit(int[] fruits) {
        // input validation
        if (fruits == null || fruits.length == 0)
            return 0;
        int n = fruits.length, maxFruits = 0;
        for (int index = 0; index < n; index++) {
            Set<Integer> types = new HashSet<>();
            int itr = index;
            while (itr < n && (types.size() < 2 || types.contains(fruits[itr]))) {
                types.add(fruits[itr]);
                itr++;
            }
            maxFruits = Math.max(maxFruits, itr - index);
        }
        return maxFruits;
    }
}