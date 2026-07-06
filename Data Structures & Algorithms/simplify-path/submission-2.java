class Solution {
    public String simplifyPath(String path) {
        // input validation
        if (path == null || path.length() == 0)
            return path;
        // Splithing the given path into String array using "/" as delimiter
        String[] pathSplit = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : pathSplit) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }
        StringBuilder canonicalPath = new StringBuilder();
        while (!stack.isEmpty()) {
            canonicalPath.append("/").append(stack.pollLast());
        }
        return (canonicalPath.length() == 0) ? "/" : canonicalPath.toString();
    }
}