class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
        int res[]= new int[n];
        int[] sortedArray=arr.clone();
        Arrays.sort(sortedArray);
        int rank=1;
        for(int num:sortedArray){
            if(!t.containsKey(num)){
                t.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            res[i]=t.get(arr[i]);
        }
        
        return res;
    }
}