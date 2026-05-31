class Solution {
    public int appendCharacters(String s, String t) {
        //make sure input is valid
        if(s == null || t == null) return 0;
        int sIdx = 0, tIdx = 0, appendReq = 0;
        while(sIdx < s.length() && tIdx < t.length()){
            if(s.charAt(sIdx) == t.charAt(tIdx)){
                tIdx++;
            }
            sIdx++;
        }
        return t.length() - tIdx;
    }
}