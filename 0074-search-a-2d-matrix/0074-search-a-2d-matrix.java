class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int low=0,i=0;
        int high=m*n-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==matrix[mid/n][mid%n]){
                idx=1;
                return true;
            }
            else if(target<matrix[mid/n][mid%n]){
                high=mid-1;                
            }    
            else{
                low=mid+1;
            }
        }
        if(idx== -1){
            return false;
        }
        else
            return true;
    }
}