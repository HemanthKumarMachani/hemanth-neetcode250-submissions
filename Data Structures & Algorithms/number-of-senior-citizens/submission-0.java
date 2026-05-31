class Solution {
    public int countSeniors(String[] details) {
        // input validation
        if (details == null || details.length == 0)
            return 0;
        int seniorCitizens = 0;
        for (int index = 0; index < details.length; index++) {
            int currentCitizenAge = Integer.parseInt(details[index].substring(11, 13));
            if (currentCitizenAge > 60)
                seniorCitizens++;
        }
        return seniorCitizens;
    }
}