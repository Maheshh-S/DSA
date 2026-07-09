class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int n = s.length();
        int r = n-1;

        while(l < r){
            if(s.charAt(r) != s.charAt(l)){
                return check(s , l+1, r ) || check(s,l,r-1);
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
    private boolean check(String s, int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;

            l++;
            r--;
        }
        return true;
    }
}