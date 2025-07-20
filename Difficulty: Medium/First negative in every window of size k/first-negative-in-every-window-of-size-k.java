class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        
        List<Integer> l = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        
        
        int i = 0 ;
        int j = 0;
        int n = arr.length;
        
        while( j < n){
            
            if(arr[j] < 0){
                dq.add(arr[j]);
            }
            
            if(j - i + 1 < k){
                j++;
            }else if(j - i +1 ==k){
                
                if(!dq.isEmpty()){
                    l.add(dq.peek());
                    
                }else{
                    l.add(0);
                }
                
                
                if(!dq.isEmpty() && dq.peek() == arr[i]){
                    dq.poll();
                }
                
                j++;
                i++;
            }
        }
    return l;
    }
}