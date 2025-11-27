class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        StringBuilder res = new StringBuilder();

        int i = 0 ; 

        while(i<n || i < m){
            if(i<n){
            res.append(word1.charAt(i));

            }

            if(i<m){
            res.append(word2.charAt(i));

            }
            i++;
        }
        // char[] chararray1 = word1.toCharArray();
        // char[] chararray2 = word2.toCharArray();

return res.toString();
        }
}