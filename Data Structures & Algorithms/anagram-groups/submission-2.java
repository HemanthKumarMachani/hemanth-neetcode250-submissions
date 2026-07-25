class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // input validation
        if (strs == null || strs.length == 0)
            return Collections.emptyList();
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for (String s : strs) {
            char[] strToChArr = s.toCharArray();
            Arrays.sort(strToChArr);
            String key = new String(strToChArr);
            groupedAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}
