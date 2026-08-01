class Solution {
    public boolean isValid(String s) {
        // input validation
        if (s == null)
            return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '}' || c == ']' || c == ')') {
                if (!stack.isEmpty() && c == isClosedPair(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public char isClosedPair(char c) {
        if (c == '[')
            return ']';
        else if (c == '{')
            return '}';
        else
            return ')';
    }
}
