class Solution {
    public int totalFruit(int[] fruits) {
        // input validation
        if (fruits == null || fruits.length == 0)
            return 0;
        int maxFruits = 0;
        for (int left = 0; left < fruits.length; left++) {
            Set<Integer> types = new HashSet<>();
            int right = left;
            while (right < fruits.length && (types.contains(fruits[right]) || types.size() < 2)) {
                types.add(fruits[right]);
                right++;
            }
            maxFruits = Math.max(maxFruits, right - left);
        }
        return maxFruits;
    }
}