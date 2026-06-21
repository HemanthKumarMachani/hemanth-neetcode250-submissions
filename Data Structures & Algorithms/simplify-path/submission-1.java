class Solution {
    public String simplifyPath(String path) {
        // input validation
        if (path == null)
            return path;
        String[] pathSplit = path.split("/");
        // [neetcode, practice, "", "...", "", "", "..", "courses"]
        Deque<String> stack = new ArrayDeque<>();
        String canonicalPath = "";
        for (String p : pathSplit) {
            if (p.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (!p.equals(".") && !p.equals("")) {
                stack.push(p);
            }
        }
        while (!stack.isEmpty()) {
            if (canonicalPath.equals(""))
                canonicalPath += stack.pollLast();
            else
                canonicalPath += "/" + stack.pollLast();
        }
        return "/" + canonicalPath;
    }
}