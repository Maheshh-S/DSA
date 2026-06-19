class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        int cnt = 0;
        int pSum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put( 0 , 1);
        for(int r=0;r<n;r++){
            pSum += arr[r];
            int target = pSum - k;
            if(map.containsKey(target)){
                cnt+= map.get(target);
            }
            
            map.put(pSum , map.getOrDefault(pSum , 0) +1);
        }
        return cnt;
    }
}