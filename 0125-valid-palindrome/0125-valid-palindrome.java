class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll(" ","");
        s = s.replaceAll("[^a-z0-9]", ""); //"AmanaplanacanalPanama"
        //amanaplanacanalpanama
            //l                  r


        int n = s.length();
        int r = n-1;
        int l = 0;

        while( l < r){

            if(s.charAt(l) != s.charAt(r)){
                return false;
            }

            l++;
            r--;
        }
        return true;
    }
}