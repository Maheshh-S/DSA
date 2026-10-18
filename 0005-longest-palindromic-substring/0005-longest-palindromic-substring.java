class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0 ; i < s.length() ; i++){ // n
            for(int j = i; j < s.length() ; j++){ // n
                String sub = s.substring(i , j +1);
                if(check(sub)){ //n
                    if(sub.length() > longest.length()){
                        longest = sub;
                    }
                }
            }

        }
        return longest;
    }

    private boolean check(String s){
        int l =0;
        int r = s.length()-1;

        while( l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
/* 
"babad"
  ^


//O(n^3)
 */