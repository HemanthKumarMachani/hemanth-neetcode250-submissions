class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '}' || ch == ']' || ch == ')') {
                if (!stack.isEmpty() && ch == closingPair(stack.peek())) {
                    stack.pop();
                } else
                    return false;
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
    public char closingPair(char ch) {
        if (ch == '(')
            return ')';
        else if (ch == '[')
            return ']';
        else
            return '}';
    }
}
