class Solution {
    public int minOperations(String[] logs) {
        Deque<String> dq = new ArrayDeque<>();
        for (String log : logs) {
            if (log.equals("../")) {
                if (!dq.isEmpty()) {
                    dq.pop();
                }
            } else if (!log.equals("./")) {
                dq.push(log);
            }
        }
        return dq.size();
    }
}