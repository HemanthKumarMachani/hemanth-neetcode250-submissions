class Solution {
    public String simplifyPath(String path) {
        // input validation
        if (path == null || path.length() == 0)
            return path;
        String[] pathSplit = path.split("/");
        Deque<String> simplifiedPathStack = new ArrayDeque<>();
        for (String p : pathSplit) {
            if (p.equals(".") || p.equals(""))
                continue;
            else if (p.equals("..")) {
                if (!simplifiedPathStack.isEmpty()) {
                    simplifiedPathStack.pop();
                }
            } else
                simplifiedPathStack.push(p);
        }

        if (simplifiedPathStack.isEmpty()) {
            return "/";
        }
        StringBuilder simplifiedPath = new StringBuilder();
        while (!simplifiedPathStack.isEmpty()) {
            simplifiedPath.append("/");
            simplifiedPath.append(simplifiedPathStack.pollLast());
        }
        return simplifiedPath.toString();
    }
}