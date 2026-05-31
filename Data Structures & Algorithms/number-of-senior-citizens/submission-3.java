class Solution {
    public int countSeniors(String[] details) {
        // input validation
        if (details == null || details.length == 0)
            return 0;
        int seniorCitizens = 0;
        for (String citizen : details) {
            if (citizen.charAt(11) - '6' > 0)
                seniorCitizens++;
            else if (citizen.charAt(11) == '6' && citizen.charAt(12) - '0' > 0)
                seniorCitizens++;
        }
        return seniorCitizens;
    }
}