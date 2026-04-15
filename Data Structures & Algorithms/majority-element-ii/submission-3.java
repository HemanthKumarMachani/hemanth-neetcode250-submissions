class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) return Collections.emptyList();
        int majorityLength = nums.length/3+1;
        List<Integer> majorityElementsList = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if(entry.getValue() >= majorityLength){
                majorityElementsList.add(entry.getKey());
            }
        }
        return majorityElementsList;
    }
}