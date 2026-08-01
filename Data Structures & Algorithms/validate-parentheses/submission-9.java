class Solution {
    public boolean isValid(String s) {
        // input validation
        if (s == null || (s.length() & 1) == 1)
            return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if(c == '(') stack.push(')');
            else if(stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

}
