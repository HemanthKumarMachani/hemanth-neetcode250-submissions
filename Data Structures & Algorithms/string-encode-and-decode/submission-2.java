class Solution {

    public String encode(List<String> strs) {
        //make sure input is valid
        if(strs == null || strs.size() == 0) return "";
        StringBuilder encodedStr = new StringBuilder();
        for(int index = 0; index < strs.size(); index++){
            String currentStr = strs.get(index);
            encodedStr.append(currentStr.length()).append("#").append(currentStr);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrs = new ArrayList<>();
        int index = 0;
        while(index < str.length()){
            int slash = str.indexOf('#', index);
            int size = Integer.parseInt(str.substring(index,slash));
            index = slash + 1;
            decodedStrs.add(str.substring(index, index + size));
            index +=size;
        }
        return decodedStrs;
    }
}
