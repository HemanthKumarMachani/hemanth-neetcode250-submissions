class Solution {
    public boolean isValid(String s) {
        // input validation
        if (s == null || s.length() == 0)
            return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == ')' || c == '}' || c == ']') {
                if (!stack.isEmpty() && c == closingPair(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            } else
                stack.push(c);
        }
        return stack.isEmpty();
    }
    public char closingPair(char ch) {
        if (ch == '{')
            return '}';
        else if (ch == '(')
            return ')';
        else
            return ']';
    }
}
