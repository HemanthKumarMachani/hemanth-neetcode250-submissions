class Solution {
    public int minimumRecolors(String blocks, int k) {
        // input validation
        if (blocks == null || blocks.length() == 0)
            return 0;
        int w_count = 0;
        for (int index = 0; index < k; index++) {
            if (blocks.charAt(index) == 'W')
                w_count++;
        }
        int result = w_count;
        for (int index = k; index < blocks.length(); index++) {
            if (blocks.charAt(index - k) == 'W')
                w_count--;
            if (blocks.charAt(index) == 'W')
                w_count++;
            result = Math.min(result, w_count);
        }
        return result;
    }
}