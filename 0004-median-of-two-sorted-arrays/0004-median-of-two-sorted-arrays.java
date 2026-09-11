class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int m = nums2.length;

        int i = 0;
        int j = 0;

        int k = 0;

        int[] merge = new int[n+m];

        while( i != n && j != m){
            if(nums1[i] <= nums2[j]){
                merge[k++] = nums1[i++];
            }else{
                merge[k++] = nums2[j++];
            }
        }

        while( i != n){
            merge[k++] = nums1[i++];
        }
        while( j != m){
            merge[k++] = nums2[j++];
        }

        int Len = merge.length;
        int mid = Len / 2;
        double ans = 0.00;

        if(Len % 2 == 0){
            double mid1 = merge[mid];
            double mid2 = merge[mid-1];
            ans = (mid1 + mid2) /2;
        }else{
            ans = merge[mid];
        }
return ans;
    }
}