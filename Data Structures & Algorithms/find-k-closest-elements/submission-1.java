class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //make sure input is valid
        if (arr == null || arr.length == 0)
            return Collections.emptyList();
        int left = 0;
        List<Integer> closestElements = new ArrayList<>();
        //binary search to find the x or the closest element
        int low = 0, high = arr.length - 1, center = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                center = mid;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (center < 0)
            center = low; // if x not found then center will be -1
        left = center - 1;
        int right = center;
        for (int index = 0; index < k; index++) {
            if (left >= 0 && right < arr.length) {
                if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
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

        //extract the window results, one step outside left and right
        for (int index = left + 1; index < right; index++) {
            closestElements.add(arr[index]);
        }
        return closestElements;
    }

    // public List<Integer> findClosestElements(int[] arr, int k, int x) {
    //     int n = arr.length;
    //     // 1. Find the closest element using Binary Search (or linear scan)
    //     int center = Arrays.binarySearch(arr, x);
    //     if (center < 0) center = -(center + 1);

    //     // 2. Initialize pointers
    //     int left = center - 1;
    //     int right = center;

    //     // 3. Expand window
    //     List<Integer> result = new ArrayList<>();
    //     for (int i = 0; i < k; i++) {
    //         if (left >= 0 && right < n) {
    //             // Compare distances
    //             if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
    //                 left--;
    //             } else {
    //                 right++;
    //             }
    //         } else if (left >= 0) {
    //             left--;
    //         } else {
    //             right++;
    //         }
    //     }

    //     // Extract the window [left + 1, right - 1]
    //     for (int i = left + 1; i < right; i++) {
    //         result.add(arr[i]);
    //     }
    //     return result;
    // }
}