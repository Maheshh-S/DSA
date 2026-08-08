class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n+m];
        int k = 0;
        int i=0;
        int j=0;
        while(i !=n && j!=m){
            if(nums1[i] <= nums2[j]){
                merged[k++] = nums1[i++];
            }else{
                merged[k++] = nums2[j++];
            }
        }


            while(i != n){
                merged[k++] = nums1[i++];
            }

            while(j != m){
                merged[k++] = nums2[j++];
            }

            int mid = merged.length;
            double ans = 0.0;

            if(mid % 2 == 0){
                mid = mid/2;
                double m1 = merged[mid];
                double m2 = merged[mid-1];
                ans = ( m1 + m2 )/2;
                return ans;
            }else{
                mid = mid/2;
                return merged[mid];
            }

        
    }
}