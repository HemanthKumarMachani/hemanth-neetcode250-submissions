class Solution {
    public char closingPars(char ch) {
        if (ch == '{')
            return '}';
        if (ch == '[')
            return ']';
        if (ch == '(')
            return ')';
        return 'a';
    }
    public boolean isValid(String s) {
        // input validation
        if (s == null || s.length() == 0)
            return false;
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '}' || c == ')' || c == ']') {
                if (!dq.isEmpty() && c == closingPars(dq.peek()))
                    dq.pop();
                else
                    return false;
            } else
                dq.push(c);
        }
        return dq.isEmpty();
    }
}
