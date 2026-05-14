class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // make sure input is valid
        if (people == null || people.length == 0 || limit == 0)
            return 0;
        Arrays.sort(people); // {5,1,4,2} -> {1,2,4,5}
        int left = 0, right = people.length - 1, minBoats = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else
                right--;
            minBoats++;
        }
        return minBoats;
    }
}