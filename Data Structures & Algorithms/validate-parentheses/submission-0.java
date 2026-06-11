class Solution {
    public boolean isValid(String s) {
        // input validation
        if (s == null || s.length() == 0)
            return false;
        Deque<Character> dq = new ArrayDeque<>();
        Map<Character, Character> closeAndOpen = new HashMap<>();
        closeAndOpen.put('}', '{');
        closeAndOpen.put(']', '[');
        closeAndOpen.put(')', '(');
        for (char c : s.toCharArray()) {
            if (closeAndOpen.containsKey(c)) {
                if (!dq.isEmpty() && dq.peek() == closeAndOpen.get(c)) {
                    dq.pop();
                } else {
                    return false;
                }
            } else {
                dq.push(c);
            }
        }
        return dq.isEmpty();
    }
}
