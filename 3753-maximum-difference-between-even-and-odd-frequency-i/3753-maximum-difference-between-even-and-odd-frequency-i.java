class Solution {
    public int maxDifference(String s) {

        int [] freq = new int [26];

        for(char c : s.toCharArray()){

            freq[c - 'a']++;
            
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEVEN = Integer.MAX_VALUE;

        for(int count:freq){
            if(count ==0) continue;

            if(count%2 == 1){
                maxOdd = Math.max(maxOdd, count);
            }else{
                minEVEN = Math.min (minEVEN,count);
            }
        }
        if(maxOdd == Integer.MIN_VALUE){
            return -minEVEN;
        }
        if (minEVEN == Integer.MAX_VALUE) {
            return maxOdd;
        }
            return (maxOdd - minEVEN);
  }
}