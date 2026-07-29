class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // input validation
        if (s1 == null || s2 == null)
            return false;
        Map<Character, Integer> s1FreqMap = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            s1FreqMap.put(ch, s1FreqMap.getOrDefault(ch, 0) + 1);
        }
        int need = s1FreqMap.size();
        // iterate through s2
        for (int outer = 0; outer < s2.length(); outer++) {
            Map<Character, Integer> s2FreqMap = new HashMap<>();
            int match = 0;
            for (int inner = outer; inner < s2.length(); inner++) {
                char c = s2.charAt(inner);
                s2FreqMap.put(c, s2FreqMap.getOrDefault(c, 0) + 1);
                if (s1FreqMap.getOrDefault(c, 0) < s2FreqMap.get(c))
                    break;
                if (s1FreqMap.getOrDefault(c, 0) == s2FreqMap.get(c))
                    match++;
                if (match == need)
                    return true;
            }
        }
        return false;
    }
}
