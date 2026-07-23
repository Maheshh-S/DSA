class Solution {
    public String makeGood(String s) {
       
        StringBuilder sb = new StringBuilder();

        int n = s.length();

        for(char c : s.toCharArray()){
            int len = sb.length();

            if(len > 0 && (Math.abs( c - sb.charAt(len - 1))) == 32){
                sb.deleteCharAt(len - 1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}