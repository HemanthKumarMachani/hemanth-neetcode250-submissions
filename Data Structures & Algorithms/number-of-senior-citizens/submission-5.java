class Solution {
    public int countSeniors(String[] details) {
        // input validation
        if (details == null || details.length == 0)
            return 0;
        int sc_count = 0;
        for (String d : details) {
            if (Integer.parseInt(d.substring(11, 13)) > 60)
                sc_count++;
        }
        return sc_count;
    }
}