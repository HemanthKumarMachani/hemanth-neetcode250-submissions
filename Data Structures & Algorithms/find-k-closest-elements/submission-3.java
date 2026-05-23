class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - 1, center = -1;
        List<Integer> closestElements = new ArrayList<>();
        // binary search over the arr to find x or closest element
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                center = mid;
                break;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // check if the center is found or not
        if (center < 0)
            center = left;
        left = center - 1;
        right = center;
        // expand window around the center to find the closest elements
        for (int index = 0; index < k; index++) {
            if (left >= 0 && right < arr.length) {
                if (Math.abs(arr[left] - x) <= (Math.abs(arr[right] - x))) {
                    left--;
                } else {
                    right++;
                }
            } else if (left >= 0) {
                left--;
            } else {
                right++;
            }
        }

        // extract the window results, one step outside left and right
        for (int index = left + 1; index < right; index++) {
            closestElements.add(arr[index]);
        }
        return closestElements;
    }
}