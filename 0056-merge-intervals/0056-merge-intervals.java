class Solution {
    public int[][] merge(int[][] arr) {
        

        int n = arr.length;

        List<int[]> res = new ArrayList<>();

        if( n <= 1) return arr;

        Arrays.sort(arr, (a,b) -> a[0] - b[0]);

        int start1 = arr[0][0];
        int end1 = arr[0][1];

        for(int i=1; i < n ; i++){

            int start2 = arr[i][0];
            int end2 = arr[i][1];

            if(end1 >= start2){
                //merge it
                end1 = Math.max(end1 , end2);
            }else{
                res.add(new int[]{start1 , end1});

                start1 = start2;
                end1 = end2;
            }

        }

        res.add(new int[]{start1, end1});

        return res.toArray(new int[res.size()][]);
    }
}