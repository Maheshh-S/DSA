class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Deque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[n];

        for(int i=0;i<m;i++){
            map.put(nums2[i] , -1);
        }


        for(int i = m-1; i>=0; i--){
            
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                stack.pop();
            }

             if(stack.isEmpty()){
        map.put(nums2[i], -1);
    }else{
        map.put(nums2[i], stack.peek());
    }

            stack.push(nums2[i]);
        }

        // [3,4,-1,-1]


        for(int i = 0;i<n;i++){
            ans[i] = map.get(nums1[i]);
        }
return ans;     
    }

}