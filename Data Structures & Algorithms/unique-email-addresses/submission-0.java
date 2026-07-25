class Solution {
    public int numUniqueEmails(String[] emails) {
        // input validation
        if (emails == null || emails.length == 0)
            return 0;
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String local = split[0];
            String domain = split[1];
            local = local.split("\\+")[0];
            local = local.replace(".", "");
            uniqueEmails.add(local + "@" + domain);
        }
        return uniqueEmails.size();
    }
}