class Solution {
    public void deleteMid(Stack<Integer> s) {
        // code here
        
        int size = s.size();
        int elem = size/2 +1;
        
        
        
         delete(s , elem , 1);
        
    }
       public void delete(Stack<Integer> st , int mid , int curr){
           int temp = st.pop(); // 50 , 40 , 30 ,
           
            if(mid != curr){// 1,2,3
                delete(st , mid , curr+1);
                st.push(temp);
            }
        
        
        }
        
    
}