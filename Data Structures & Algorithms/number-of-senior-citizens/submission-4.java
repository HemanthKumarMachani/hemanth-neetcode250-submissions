class Solution {
    public int countSeniors(String[] details) {
        // input validation
        if (details == null || details.length == 0)
            return 0;
        int seniorCitizens = 0;
        for (String citizen : details) {
            if (Integer.parseInt(citizen.substring(11, 13)) > 60)
                seniorCitizens++;
        }
        return seniorCitizens;
    }
}