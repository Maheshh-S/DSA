class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Deque<Integer> st = new ArrayDeque<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[n];
        for(int i = m-1; i >=0 ; i--){
            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();
            }

            if(!st.isEmpty()){
                map.put(nums2[i] , st.peek());
            }else{
                map.put(nums2[i] , -1);
            }

            st.push(nums2[i]);
        }

        for(int i = 0 ; i < n ; i++){
            nums1[i] = map.getOrDefault(nums1[i] , -1);
        }

return nums1;
    }
}