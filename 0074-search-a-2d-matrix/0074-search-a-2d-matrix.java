class Solution {
    public boolean searchMatrix(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;
    if(rows == 0) return false;
    if( cols == 0) return false;

        int i=0 , j=cols-1;

        while(i< rows && j >=0){
            if(arr[i][j] == key){
                return true;
            }else if(arr[i][j] > key){
                j--;
            }else{
                i++;
            }
        } 
        return false;
    }
}