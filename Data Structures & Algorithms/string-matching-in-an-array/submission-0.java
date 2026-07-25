class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> matchesList = new ArrayList<>();
        // input validation
        if (words == null || words.length == 0)
            return matchesList;
        for (int outer = 0; outer < words.length; outer++) {
            for (int inner = 0; inner < words.length; inner++) {
                if (outer == inner)
                    continue;
                if (words[inner].contains(words[outer])) {
                    matchesList.add(words[outer]);
                    break;
                }
            }
        }
        return matchesList;
    }
}