class Solution {
    public String longestCommonPrefix(String[] strs) {
        //input validation
        if(strs == null || strs.length == 0) return "";
        String lc_prefix = strs[0];
        for(String s : strs){
            while(!s.startsWith(lc_prefix)){
                lc_prefix = lc_prefix.substring(0,lc_prefix.length() - 1);
            }
        }
        return lc_prefix;
    }
}