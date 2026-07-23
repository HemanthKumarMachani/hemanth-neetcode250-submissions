class Solution {
    public int minimumRecolors(String blocks, int k) {
        // input validation
        if (blocks == null || blocks.length() == 0)
            return 0;
        int windowBlacks = 0, maxBlacks = 0;
        for (int index = 0; index < k; index++) {
            if (blocks.charAt(index) == 'B') {
                windowBlacks++;
            }
        }
        maxBlacks = Math.max(windowBlacks, maxBlacks);
        int left = 0, right = k;
        while (right < blocks.length()) {
            if (blocks.charAt(right++) == 'B')
                windowBlacks++;
            if (blocks.charAt(left++) == 'B')
                windowBlacks--;
            maxBlacks = Math.max(windowBlacks, maxBlacks);
        }
        return k - maxBlacks;
    }
}