class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
Arrays.sort(nums);

int n = nums.length;

List<int[]> ans = new ArrayList<>();

for(int i = 2; i < n ; i+=3){
    if(nums[i] - nums[i-2] > k){
        return new int[0][];
        // ans.add(Arrays.asList  (   nums[i],nums[i-1],nums[i-2]  ));
    }else{
        ans.add(new int[] { nums[i],nums[i-1],nums[i-2] });
    }
    
}
return ans.toArray(new int [ ans.size()] [] );
    }
}