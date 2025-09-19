class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0] , b[0]));

        List<int[] > mer = new ArrayList<>();

        int[] prev = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= prev[1]){

            prev[1] = Math.max(prev[1] , intervals[i][1]);
        }else{
            mer.add(prev);
            prev = intervals[i];
        }
        }
mer.add(prev);
return mer.toArray(new int[mer.size()][]);
    }
}