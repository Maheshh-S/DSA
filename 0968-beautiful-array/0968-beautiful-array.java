class Solution {
    public int[] beautifulArray(int n) {
       int[] answer = new int[n]; 
        if(n == 1) {
            answer[0] = 1;
            return answer;
        }
            int[] right =beautifulArray(n/2);
            int[] left = beautifulArray((n+1)/2);
			
            for(int i=left.length; i<n; i++) {      //This loop adds all even elements at end
                answer[i] = right[i-left.length] * 2; 
            }
            for(int i=0; i<left.length; i++) {      //This loop adds all odd elements at start
                answer[i] = left[i] * 2 - 1;     
            }
        return answer;
    }
}