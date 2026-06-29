class Solution {
    int maxLength(int arr[]) {
        // code here
        
        int n = arr.length;
        int ans = 0;
        int sum = 0;
        
        HashMap<Integer , Integer> map = new HashMap<>();
            // map.put(0 , -1);
            
        for(int i = 0 ; i <n; i++){
        
            sum += arr[i];
            
        if(sum == 0){
            ans = Math.max(ans , i+1);
        }else if(map.containsKey(sum)){
            ans = Math.max(ans , i - map.get(sum));
            
        }else{
            map.put(sum , i);
        }
        }
        return ans;
    }
}