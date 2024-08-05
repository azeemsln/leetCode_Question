class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        ArrayList<String> a=new ArrayList<String>();
        int j,i;
        for( i=0;i<n;i++){
            for( j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(arr[i].equals(arr[j])){
                    break;
                }
            }
            if(j==n){
                a.add(arr[i]);
            }
        }
        if(k<=a.size()){
            return a.get(k-1);
        }
        else
            return "";
    }
}