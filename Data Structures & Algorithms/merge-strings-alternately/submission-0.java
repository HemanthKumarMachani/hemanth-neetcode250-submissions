class Solution {
    public String mergeAlternately(String word1, String word2) {
        //make sure input if valid
        if (word1 == null || word2 == null)
            return (word1 == null) ? word2 : word1;
        int firstWordLength = word1.length(), secondWordLength = word2.length();
        StringBuilder mergedString = new StringBuilder();
        int firstWordIndex = 0, secondWordIndex = 0;
        while (firstWordIndex < firstWordLength && secondWordIndex < secondWordLength) {
            mergedString.append(word1.charAt(firstWordIndex++));
            mergedString.append(word2.charAt(secondWordIndex++));
        }
        while (firstWordIndex < firstWordLength) {
            mergedString.append(word1.charAt(firstWordIndex++));
        }
        while (secondWordIndex < secondWordLength) {
            mergedString.append(word2.charAt(secondWordIndex++));
        }
        return mergedString.toString();
    }
}