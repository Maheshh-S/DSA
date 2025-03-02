class Solution {
    public List<String> validStrings(int n) {
        List<String> Ans = new ArrayList<>(); // initialize answer array
        if (n == 1) {
            // for a length of 1
            // we have two options
            Ans.add("0");
            Ans.add("1");
            return Ans;
        }
        List<String> solutionForRemainingLength = validStrings(n - 1);
        for (String str : solutionForRemainingLength) {
            Ans.add("1" + str); // '1' can be appended with either '0' or '1'
            if (str.charAt(0) == '1') {
                Ans.add("0" + str); // '0' can be appended only for '1'
            }
        }
        return Ans;
    }
}