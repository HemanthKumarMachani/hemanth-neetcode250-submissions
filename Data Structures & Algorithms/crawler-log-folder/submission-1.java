class Solution {
    public int minOperations(String[] logs) {
        // input validation
        if (logs == null || logs.length == 0)
            return 0;
        int depth = 0;
        for (String log : logs) {
            if (log.equals("./")) {
                continue;
            } else if (log.equals("../")) {
                depth = Math.max(0, depth - 1);
            } else {
                depth++;
            }
        }
        return depth;
        // Deque<String> dq = new ArrayDeque<>();
        // for (String log : logs) {
        //     if (log.equals("../")) {
        //         if (!dq.isEmpty()) {
        //             dq.pop();
        //         }
        //     } else if (!log.equals("./")) {
        //         dq.push(log);
        //     }
        // }
        // return dq.size();
    }
}