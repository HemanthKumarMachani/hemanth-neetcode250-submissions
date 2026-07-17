class Solution {
    public int totalFruit(int[] fruits) {
        // input validaion
        if (fruits == null || fruits.length == 0)
            return 0;
        // Initialize HashMap to count the freq of the each type, storing maximum of 2 types
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0; //maxFruits = 0, currentTotal = 0;
        for (int right = 0; right < fruits.length; right++) {
            frequencyMap.put(fruits[right], frequencyMap.getOrDefault(fruits[right], 0) + 1);
            //currentTotal++;
            if (frequencyMap.size() > 2) {
                int fruit = fruits[left];
                frequencyMap.put(fruit, frequencyMap.get(fruit) - 1);
                //currentTotal--;
                if (frequencyMap.get(fruit) == 0) {
                    frequencyMap.remove(fruit);
                }
                left++;
            }
            //maxFruits = Math.max(maxFruits, currentTotal);
        }
        //return maxFruits;
        return fruits.length - left;
    }
}