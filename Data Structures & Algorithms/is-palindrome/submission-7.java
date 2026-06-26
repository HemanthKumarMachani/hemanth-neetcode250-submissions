class Solution {
    public boolean isPalindrome(String s) {
        // input validation
        if (s == null || s.length() == 0)
            return false;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            char currentLeft = s.charAt(left);
            char currentRight = s.charAt(right);
            if (!String.valueOf(currentLeft).equalsIgnoreCase(String.valueOf(currentRight)))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
