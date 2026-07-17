public class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int l = 0;

        for (int r = 0; r < fruits.length; r++) {
            count.put(fruits[r], count.getOrDefault(fruits[r], 0) + 1);

            if (count.size() > 2) {
                count.put(fruits[l], count.get(fruits[l]) - 1);
                if (count.get(fruits[l]) == 0) {
                    count.remove(fruits[l]);
                }
                l++;
            }
        }

        return fruits.length - l;
    }
}