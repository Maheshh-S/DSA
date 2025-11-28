class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] carr = s.toCharArray();
        int l =0;
        int r = n-1;
        while(l<r){

           boolean left = (carr[l] == 'a' || carr[l] == 'A' || carr[l] == 'e' || carr[l] == 'E' ||
                 carr[l] == 'i' || carr[l] == 'I' || carr[l] == 'o' || carr[l] == 'O' ||
                 carr[l] == 'u' || carr[l] == 'U');


            boolean right = (carr[r] == 'a' || carr[r] == 'A' || 
                 carr[r] == 'e' || carr[r] == 'E' || 
                 carr[r] == 'i' || carr[r] == 'I' || 
                 carr[r] == 'o' || carr[r] == 'O' || 
                 carr[r] == 'u' || carr[r] == 'U');

                 if(left && right){
                    char temp = carr[l];
                    carr[l] = carr[r];
                    carr[r] = temp;
                    l++;
                    r--;
                 }else if(left){
                    r--;
                 }else{
                    l++;
                 }
        }
return new String(carr);
    }
}