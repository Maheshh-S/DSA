class Solution {
    public void deleteMid(Stack<Integer> s) {
        // code here
        
        int size = s.size();
        int mid = (size/2 ) +1;
        
        checkDelete(s , mid , 1);
    }
    
    public void checkDelete(Stack<Integer> st ,int mid ,int curr){
        
        int temp = st.pop();
        
        if(curr != mid){
            checkDelete(st,mid,curr+1);
            st.push(temp);
        }
    }
    
}