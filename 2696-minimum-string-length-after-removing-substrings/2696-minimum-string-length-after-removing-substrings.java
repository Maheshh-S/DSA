class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            int len = sb.length();

            if(len > 0 &&
                (
             (sb.charAt(len - 1) == 'A' && c == 'B') ||
                          (sb.charAt(len - 1) == 'C' && c == 'D')
            )){
                sb.deleteCharAt(len-1);
            }else{
                sb.append(c);
            }
        }
        return sb.length();
    }
}