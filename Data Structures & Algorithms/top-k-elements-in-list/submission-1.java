class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //make sure input in valid 
        if(nums == null || nums.length == 0) return nums;
        //count the frequncy of each element
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums) freq.put(num, freq.getOrDefault(num,0)+1);
        //Use priority queue with Max-Heap to get the max element on top
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        pq.addAll(freq.entrySet());
        int [] result = new int [k]; int index =0;
        while(!pq.isEmpty() && index<k){
            Map.Entry<Integer,Integer> entry = pq.poll();
            result[index++] = entry.getKey();
        }
        return result;
    }
}
