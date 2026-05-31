class Solution {
    public int lengthOfLastWord(String s) {
        //make sure input is valid
        if(s == null || s.length() == 0) return 0;
        int sIdx = s.length()-1, lastWordLen = 0;
        while(sIdx >= 0){
            if(Character.isLetterOrDigit(s.charAt(sIdx))){
                while(sIdx >= 0 && Character.isLetterOrDigit(s.charAt(sIdx--))){
                    lastWordLen++;
                }
                break;
            }
            sIdx--;
        }
        return lastWordLen;
    }
}