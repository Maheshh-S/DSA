class Solution {
    public String reverseWords(String s) {
     String clean =  s.trim().replaceAll("\\s+"," ") ;


    String[] arr = clean.split(" ");
     int n = arr.length;
    int l = 0;
    int r = n-1;
    while(l<r){
        String temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        l++;
    r--;
    }
    
    return String.join(" ",arr);

    }

}