class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        int i = 0 ;
        int j = 0;
         int max = 0;
        int n = s.length();

        Set<Character> charSet = new HashSet<>();

        for(j = 0; j < n; j++){

            while(charSet.contains(s.charAt(j))){
                charSet.remove(s.charAt(i));
                i++;
            }
            charSet.add(s.charAt(j));

            max = Math.max(max, j-i+1);
        }
         return max;
    }
}