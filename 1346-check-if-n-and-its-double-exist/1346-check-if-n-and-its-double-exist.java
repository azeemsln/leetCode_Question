class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==0 && arr[j]==0){
                    return true;
                }
                if(arr[i]==2*arr[j] && arr[i]!=0){
                    return true;
                }
            }
        }
        return false;
    }
}