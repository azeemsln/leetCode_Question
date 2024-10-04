class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        Arrays.sort(skill);
        long count=0;
        int end=n-1;
        for(int i=0;i<n/2;i++){
            if(skill[i]+skill[end]==skill[0]+skill[n-1]){
                count=count+skill[i]*skill[end];
                end--;
            }
            else{
                return -1;
            }
        }
        return count;
    }
}